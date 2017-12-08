// Prints the numbers from x down to 0.
// Beware: negative input may cause stack overflow.
recursive(x) {
  return
      putint(x),
      putchar(10),
      (x) ? recursive(x-1) : 0;
}

main() {
  return recursive(getint());
}
