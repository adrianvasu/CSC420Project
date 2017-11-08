	SUBSP	2,i
	CALL	main
	ADDSP	2,i
	STOP
main:	NOP0
x:	.EQUATE	0
	SUBSP	2,i
	CALL	getint
	LDWA	0,i
	ADDSP	2,i
	LDWA	0,i
	STWA	2,s
	RET
getint:	NOP0
	RET
	.END
