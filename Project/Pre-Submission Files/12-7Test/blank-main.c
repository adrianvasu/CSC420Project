myfun(x, y){ //  Only parameters are available--no local variables.

   //  There is only ever one statement in a MountC function.
   //  Within that statement, you can have a lot of expressions, however,
   //  including an if-expression
   return
     y = getint(),
     (y - 2) // if (y - 2 != 0)
       ? (x = 10 - 20 + y, y = 3)
       : (y = 25),
     putint(x),  // Print the value in x
     putchar(32),
     putint(y),
     putchar(10),
     0;          // There will always be a return value.
}

main() {         // You may assume there are no parameters to main.
  return myfun(0, 0);
}
