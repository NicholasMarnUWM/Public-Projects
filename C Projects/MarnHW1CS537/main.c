#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    // Note: The following sources were used to help implement this: https://www.geeksforgeeks.org/strings-in-c-2/
    // however, all code is my own.
    char input[] = "We hold these truths to be self-evident, that all men are created equal, that they are endowed, "
                   "by their Creator, with certain unalienable Rights, that among these are Life, Liberty, "
                   "and the pursuit of Happiness. That to secure these rights, Governments are instituted among Men, "
                   "deriving their just powers from the consent of the governed, That whenever any Form of "
                   "Government becomes destructive of these ends, it is the Right of the People to alter or abolish it, "
                   "and to institute new Government, laying its foundation on such principles, and organizing its powers "
                   "in such form, as to them shall seem most likely to effect their Safety and Happiness. "
                   "Prudence, indeed, will dictate that Governments long established should not be changed for "
                   "light and transient causes; and accordingly all experience hath shewn, that "
                   "mankind are more disposed to suffer, while evils are sufferable, than to right themselves by "
                   "abolishing the forms to which they are accustomed. But when a long train of abuses and usurpations, "
                   "pursuing invariably the same Object, evinces a design to reduce them under absolute Despotism, "
                   "it is their right, it is their duty, to throw off such Government, and to provide new "
                   "Guards for their future security.";
    //printf("%s", input);
    char * stringTokens =strtok(input,".");
    int totalNumberOfWords = 0;
    int sentenceCount = 0;

    while(stringTokens != NULL) {
        stringTokens = strtok(NULL,".");
        printf(stringTokens);
        sentenceCount++;

    }





    // create the array of strings given that we now know how many strings to expect. This idea was borrowed
    // from https://stackoverflow.com/questions/1088622/how-do-i-create-an-array-of-strings-in-c/1095006












    return 0;
}
