myFun() {
    return
    (getint() - 10)
    ? (getint() - 1)
        ? putint(5)
        : putint(8)
    : putint(1),
    putint(2 - (3 - 1));
}

main() {
    return
    putchar(97),
    myFun();
}
