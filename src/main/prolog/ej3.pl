palabra(astante, a,s,t,a,n,t,e).
palabra(astoria, a,s,t,o,r,i,a).
palabra(baratto, b,a,r,a,t,t,o).
palabra(cobalto, c,o,b,a,l,t,o).
palabra(pistola, p,i,s,t,o,l,a).
palabra(statale, s,t,a,t,a,l,e).

crucigrama(V1,V2,V3,H1,H2,H3) :-
    permutation(
        [astante,astoria,baratto,cobalto,pistola,statale],
        [V1,V2,V3,H1,H2,H3]
    ),
    palabra(V1, _,V12,_,V14,_,V16,_),
    palabra(V2, _,V22,_,V24,_,V26,_),
    palabra(V3, _,V32,_,V34,_,V36,_),
    palabra(H1, _,V12,_,V22,_,V32,_),
    palabra(H2, _,V14,_,V24,_,V34,_),
    palabra(H3, _,V16,_,V26,_,V36,_).
