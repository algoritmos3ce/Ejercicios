(ns ejercicios.ej2)

(defn palindrome? [s]
  (case (count s)
    (0 1) true
    (let [f (first s)
          m (rest (butlast s))
          l (last s)]
      (and (= f l)
           (palindrome? m)))))

(defn capicua? [n]
  (palindrome? (seq (str n))))

(assert (capicua? 5))
(assert (capicua? 55))
(assert (capicua? 585))
(assert (capicua? 59895))
(assert (not (capicua? 59875)))
