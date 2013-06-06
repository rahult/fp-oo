(def add-squares
     (fn [& numbers]
       (apply + (map * numbers numbers))))

(add-squares 1 2 5)


(def second (fn [list] (first (rest list))))

(second [1 5 3 4])

(def third (fn [list] (first (rest (rest list)))))


(def third (fn [list] (nth list 2)))

(third [1 4 6 7])


(list? (rest [1 2 3]))

(seq? (rest [1 2 3]))

(vector? (rest [1 2 3]))

(= [2 3] '[2 3])

(= [2 3] (rest [1 2 3]))

[inc dec]
'[inc dec]

'a

[ 'my 'number (+ 1 3)]

(if (odd? 3)
    (prn "Odd!")
    (prn "Even!"))

(def add-squares
  (fn [& numbers]
    (apply + (map * numbers numbers))))

(add-squares 1 2 3 4 5 6)

(def wow
  (fn [& numbers]
    (map / numbers numbers)))

(wow 1 2 3 4 5)

(/ 1 2 3 4 5)


(def my-apply
  (fn [function sequence]
    (eval (cons function sequence))))

(my-apply + [1 2 3 4])


(eval (cons + [1 2 4]))

(set [1 2 4 4 5 6])

(def first-odd
  (fn [& numbers]
    (first (filter odd? numbers))))

(first-odd 1 2 3 5)

(map inc [1 2 3 4])

;; Ask question the answer should be 0
(map * [0 1 2 3 4])

(map * [0 1 2 3 4 5]
       [100 200 300 500 600 700])

(def factorial
  (fn [n]
    (apply * (range 1 (inc n)))))

(factorial 5)


(filter odd? [1 2 3 4])

(map inc [1 2 3 4 5])

(partition 2 [1 2 3 4 5])

(def solver
  (fn [x]
    ()))

(solver [1 2 3 4 5 6 7])

(def prefix-of?
  (fn [s1 s2]
    (= (take (count s1) s2) s1)))

(prefix-of? [1 2] [1 2 3 4])

(prefix-of? '(2 3) [1 2 3 4])

(prefix-of? '(1 2) [1 2 3 4])

(take (count [1 2]) [1 2 3 4])

(def tails
  (fn [s]
    s))

(tails '(1 2 3 4))


(range (inc (count [1 2 3 4])))

(repeat (inc (count [1 2 3 4])) [1 2 3 4])

(map drop (range (inc (count [1 2 3 4])))
          (repeat (inc (count [1 2 3 4])) [1 2 3 4]))

(range (inc (count [1 2 3 4])))

(repeat (inc (count [1 2 3 4])) [1 2 3 4])

(range 5)

(map drop (0 1 2 3 4)
          ([1 2 3 4] [1 2 3 4] [1 2 3 4] [1 2 3 4] [1 2 3 4]))


;;(map drop
;;    (range (inc (count seq)))
;;    (repeat (inc (count seq)) seq))

(def puzzle (fn [list] (list list)))

;; (puzzle '(1 2 3))
