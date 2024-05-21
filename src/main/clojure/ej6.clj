(ns main.clojure.ej6)

(defn slice [s n]
  (for [i (range (+ 1 (- (count s) n)))]
    (subs s i (+ i n))))

(assert (= '("abc" "bcd" "cde") (slice "abcde" 3)))
(assert (= '("ab" "bc" "cd" "de") (slice "abcde" 2)))
