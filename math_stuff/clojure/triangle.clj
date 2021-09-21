(ns triangle-numbers)
; run with `clojure -M triangle.clj`

(defn triangle [n]
  (->> (range 1 (+ n 1))
       (reduce +)))

(defn pyramid [n]
  (->> (range 1 (+ n 1))
       (map (fn [x] (* x x)))
       (reduce +)))

(println "triangle numbers:")
(println (map triangle (range 1 11)))
(println "pyramid numbers:")
(println (map pyramid (range 1 11)))

