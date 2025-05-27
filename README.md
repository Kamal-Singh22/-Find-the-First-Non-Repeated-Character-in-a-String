# -Find-the-First-Non-Repeated-Character-in-a-String
Write a Java program that takes a string as input and finds the first character that does not repeat anywhere in the string. If all characters repeat, output a message indicating that.
 Explanation:
We use a LinkedHashMap to maintain the order of characters and their counts.

First loop: Count each character.

Second loop: Return the first character with a count of 1.

If no such character is found, return 0 and print an appropriate message.

