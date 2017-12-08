//  It's legal for function definitions to never be used.

unused(a1, a2, a3, a4){
    return a1 + a2 + a3 + a4;
}

main(){
    return putint(getint() - 9);  //  unused function is ignored here!
}

unused2(){return 10;}  //  This one is ignored, too!
