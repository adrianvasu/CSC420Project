	SUBSP	2,i
	CALL	main
	ADDSP	2,i
	STOP
myFun:	NOP0
y:	.EQUATE	0
	SUBSP	2,i
	ADDSP	2,i
	LDWA	0,i
	STWA	2,s
	RET
main:	NOP0
x:	.EQUATE	0
	SUBSP	2,i
	CALL	getint
	CALL	myFun
	LDWA	0,i
	ADDSP	2,i
	LDWA	0,i
	STWA	2,s
	RET
getint:	NOP0
	RET
	.END
