SUBSP	2,i
CALL	main
ADDSP	2,i
STOP
putint:	DECO	2,s
LDWA	2,s
STWA	4,s
RET
getint:	DECI	2,s
RET
putchar:	LDWA	2,s
STBA	charOut,d
STWA	4,s
RET
getchar:	LDWA	0,i
LDBA	charIn,d
STWA	2,s
RET
myFun:	NOP0
SUBSP	2,i
SUBSP	2,i
CALL	getint
ADDSP	2,i
LDWA	-2,s
STWA	0,s
SUBA	10,i
CPWA	0,i
BRNE	__1
BR	__110
__1:	NOP0
SUBSP	2,i
CALL	getint
ADDSP	2,i
LDWA	-2,s
STWA	0,s
SUBA	1,i
CPWA	0,i
BRNE	__2
BR	__210
__2:	NOP0
SUBSP	2,i
STWA	0,s
CALL	putchar
ADDSP	4,i
BR	___2
__210:	NOP0
SUBSP	2,i
LDWA	8,i
STWA	0,s
CALL	putint
ADDSP	4,i
BR	___2
___2:	BR	___1
STWA	2,s
__110:	NOP0
SUBSP	2,i
LDWA	1,i
STWA	0,s
CALL	putint
ADDSP	4,i
BR	___1
___1:	STWA	2,s
SUBSP	2,i
LDWA	2,i
LDWA	3,i
SUBA	1,i
NEGA
ADDA	2,i
STWA	0,s
CALL	putint
ADDSP	4,i
ADDSP	2,i
RET
main:	NOP0
SUBSP	2,i
CALL	myFun
ADDSP	2,i
RET
.END
