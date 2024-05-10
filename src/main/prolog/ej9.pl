regla1([roja, _, _], [uruguayos, _, _]).
regla1([_, roja, _], [_, uruguayos, _]).
regla1([_, _, roja], [_, _, uruguayos]).

regla2([espanioles, _, _], [jaguar, _, _]).
regla2([_, espanioles, _], [_, jaguar, _]).
regla2([_, _, espanioles], [_, _, jaguar]).

regla3([caracol, _, _], [_, japoneses, _]).
regla3([_, caracol, _], [_, _, japoneses]).

regla4([_, azul, _], [caracol, _, _]).
regla4([_, _, azul], [_, caracol, _]).

solucion(Col, Nac, Masc) :-
    permutation(Col, [roja, azul, verde]),
    permutation(Nac, [uruguayos, espanioles, japoneses]),
    permutation(Masc, [jaguar, caracol, cebra]),
    regla1(Col, Nac),
    regla2(Nac, Masc),
    regla3(Masc, Nac),
    regla4(Col, Masc).
