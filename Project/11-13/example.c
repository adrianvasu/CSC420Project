myfun(x, y){ //  Only parameters are available--no local variables.

   //  There is only ever one statement in a MountC program.
   //  Within that statement, you can have a lot of expressions, however,
   //  including an if-expression
   return
     y = getint(),
     putint(x),  // Print the value in x
     putchar(32),
     putint(y),
     putchar(10),
     0;          // There will always be a return value.
}

main() {         // You may assume there are no parameters to main.
    return myfun(0, 0);
}
