mago(ron).
tieneVarita(harry).
juegaQuidditch(harry).
mago(X) :- tieneEscoba(X), tieneVarita(X).
tieneEscoba(X) :- juegaQuidditch(X).
