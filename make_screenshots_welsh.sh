## "The below line comments out every line where there is a check for the title"
grep -r "should be redirected" src/test/resources/features/XX_Screenshots.feature | sed -i '' 's/\(.*\should be redirected\)/#\1/' src/test/resources/features/XX_Screenshots.feature

# "The below line changes the text English to Welsh in the Screenshot feature"
sed -i '' 's/English/Welsh/' src/test/resources/features/XX_Screenshots.feature