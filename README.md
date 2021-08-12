# Simple Search Engine

Created an own search engine! It probably won’t compete with Google: it will be a simple version which processes some data and searches it for a word or a phrase. Simple but cool.

## Strategy

The programs first reads data from file.

Here is an example of a line in the file.

It contains three items: first name, last name, and/or email of a person. 

    Dwight Joseph djo@gmail.com
    Rene Webb webb@gmail.com
    Katie Jacobs
    Erick Harrington harrington@gmail.com
    Myrtle Medina
    Erick Burgess

There are three types of search strategy.

Let's consider the searching strategies: ALL, ANY and NONE.

If the strategy is `ALL`, the program should print lines containing all the words from the query.

**Query:**

    Harrington Erick

**Result:**

    Erick Harrington harrington@gmail.com

If the strategy is `ANY`, the program should print the lines containing at least one word from the query.

**Query:**

    Erick Dwight webb@gmail.com

**Result:**

    Erick Harrington harrington@gmail.com

    Erick Burgess

    Dwight Joseph djo@gmail.com

    Rene Webb webb@gmail.com

If the strategy is `NONE`, the program should print lines that do not contain words from the query at all:

**Query:**

    djo@gmail.com ERICK

**Result:**

    Katie Jacobs
    Myrtle Medina
    Rene Webb webb@gmail.com


##Example

    === Menu ===
    1. Find a person
    2. Print all persons
    0. Exit
    > 1

    Select a matching strategy: ALL, ANY, NONE
    > ANY

    Enter a name or email to search all suitable people.
    > Katie Erick QQQ

    3 persons found:
    Katie Jacobs
    Erick Harrington harrington@gmail.com
    Erick Burgess

