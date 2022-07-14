for FILE in /var/tmp/*_LOCAL;
   do echo "$(tput setaf 7)$FILE/logs/stderr.txt"; echo $(tput setaf 1);cat $FILE/logs/stderr.txt | grep -vi "warning";
done;
