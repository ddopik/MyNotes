 start of Ruby file 
 notes of one 
 A ------> Append at end of line
 a ------> Append start of cursor
 i ------> Insert at  cursor
 I ------> Start at start of line
 o --------> Append new line after the cursor and create new line
 O --------> Append new line before cursor 
 :q -----> Close file
 :q!-----> Close file without promot 
 :w -----> Save changes
 :wq or x -> Save changes and exit file 
 U -------> Bring it back (undo)
 CTRL-R ----> Redo verse of (U) 
 H ------> Moves cursor Left
 L ------> Moves the cursor Right
 K ------> Moves the cursor Up 
 J ------> Moves the cursor Down
 W ------> Jump by start of word
 B ------> Jumb backword of word 
 X ------> Delete char  
 dw -----> Delete current word
 dd -----> Delete whole line or __Cut__ this Line no insert mode
 CC -----> Delete and transfare to insert mode 
 C+End --> Delete to the End of line
 YY or Y+End  ------> Copy all line

 V ------> Start visual mode
 Y ------> Copy marked text
 d ------> Delete marked text
 dd -----> Delete whole line or __Cut__ this Line
 YY or Y+End  ------> Copy aline

-----------Search/Replace-----------------
'/Pattern' ------> Search for pattern
'?Patterm' ------> Search backword for pattern
n -------> Repeat searckh in the same direction
N -------> Repeat search in opppsite direction

':%s/old/new/gc'      -----> Search and replace throught file
':g/part1/s//part2/g' -----> Replace every occurance of part1 with part2
':g/part1/s///g'      ----->Replace  part1 by nothing
':%s/pattern//gn'     -----> Count occurancce of word

 :ctrl+sp  file_name -----> open file in new buffer and split window
 :ctrl+ws -----> Split windows
 :ctrl+ww -----> Navigate between windows
 :ctrl+wq -----> Quit a window
 :ctrl+wv -----> Split windows vertically
 :set number ---->view number of current line

 'sudo su'----> start as priviladge
 'cd -' ---->Back in terminal
 'set number'------>index my file  
 ':+'number_of line ----->go to line number
 'sudo service apache2 restart' ------>Restart apach server
 ':w %my_file!'  ----->override current file.
 'rm -r'----->Remove directory and all its contents.
 'w %:p_BACKUP'---> Save file as ----; 

