//  Some simple arithmetic
context(x, y, z) {  //  This function provides some variables to work with.
    return
        x = getint(),
        y = getint(),
        z = x + y + y,
        putint(z);
}

main(){return context(0, 0, 0);}
