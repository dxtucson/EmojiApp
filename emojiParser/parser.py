file_name = 'people.txt'
tmp = ''
last_name = ''
last_emoji = ''

def write_to_file(file_name, line):
    with open('outputs/' + file_name, 'a', encoding='utf8') as file:
        file.write(line)

def append_last():
    global tmp
    global last_name
    global last_emoji
    if ('skin tone' in last_name):
        # was processing skin tone, conclude the process
        tmp += ')),\n'
        write_to_file(file_name, tmp)
        last_name = ''
        last_emoji = ''
    elif (last_emoji):
        write_to_file(file_name, 'Emoji(\"{}\",\"{}\"),\n'.format(last_emoji, last_name))
        last_name = ''
        last_emoji = ''

with open('emoji_test.txt', encoding='utf8') as file:
    for line in file:
        if ('subtotal' in line):
             append_last()
             continue
        if ('minimally-qualified' in line):
            continue
        if ('unqualified' in line):
            continue
        if ('component' in line):
            continue
        words = line.split()
        if (len(words)==0):
            continue
        if (words[0] == '#'):
            if (len(words) > 1):
                if (words[1] == 'group:'):
                    
                    if ('Smileys & Emotion' in line or 'People & Body' in line):
                        pass
                    elif('Animals & Nature' in line):
                        file_name = 'nature.txt'
                    elif('Food & Drink' in line):
                         file_name = 'food.txt'
                    elif('Travel & Places' in line):
                         file_name = 'travel.txt'
                    elif('Activities' in line):
                         file_name = 'activities.txt'
                    elif('Objects' in line):
                         file_name = 'objects.txt'
                    elif('Symbols' in line):
                         file_name = 'symbols.txt'
                    elif('Flags' in line):
                         file_name = 'flags.txt'
                    # add comment for group name
                    append_last()
                    write_to_file(file_name, "//{}".format(line[2 : : ]))  
                elif (words[1] == 'subgroup:'):                    
                    # add comment of subgroup name
                    append_last()
                    write_to_file(file_name, "//{}".format(line[2 : : ]))
        elif(len(words)>1):
            # found a emoji
            index = words.index('#')
            emoji = words[index+1]
            name = line[line.find(emoji)+ len(emoji) +len(words[index+2])+2 : : ].strip()
            if ('skin tone' in name):
                # skin tone emoji
                if ('skin tone' not in last_name):
                    # adding first skin tone
                    tmp = 'EmojiWithSkinTone(\"{}\",\"{}\", arrayOf(Emoji(\"{}\",\"{}\"), '.format(last_emoji, last_name, emoji, name)
                else:
                    # adding more skin tone
                    if (not tmp.endswith(', ')):
                        tmp += ', '
                    tmp += 'Emoji(\"{}\",\"{}\")'.format(emoji, name)
            else:
                # processing normal emoji
                append_last()
            last_emoji = emoji
            last_name = name
    file.close()

append_last()


