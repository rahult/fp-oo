;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

{:a 1, "b" 2}

(hash-map :a 1 :b 2)

(apply hash-map [:a 1 :b 2])

(def do-something-with-a-colored-point
  (fn [& args]
    (apply hash-map args)))

(do-something-with-a-colored-point :color "red", :x 1, :y 2)

(get {:a 1, :b 2} :a)

(:a {:a 1, :b 2})

(def do-something-to-map
  (fn [function]
    (function {:a "a value", :b "b value"})))

(do-something-to-map :b)

(assoc {:a 1, :b 2} :c 3 :d 4 :e 5)

(merge {:a 1, :b 2} {:c 3, :d 4} {:e 5})

(dissoc {:a 1, :b 2, :c 3} :b :c)

(assoc {:a 1, :b 2} :a 4 :b -2)

(merge {:a 1, :b 2}, {:c 3, :a 4})

(def Point
  (fn [x y]
    {:x x
     :y y}))

(:x (Point 1 2))

(def x
  (fn [this] (get this :x)))

(x (Point 1 2))

(def x
  (fn [this] (:x this)))

(x (Point 1 2))

(def x :x)
(def y :y)

(x (Point 1 2))

(Point 1 2)

(def Point
  (fn [x y]
    {:x x
     :y y
     :__class_symbol__ 'Point}))

(def class-of :__class_symbol__)

(class-of (Point 1 2))

(def shift
  (fn [this xinc yinc]
    (Point (+ (x this) xinc)
           (+ (y this) yinc))))

(shift (Point 1 200) -1 -200)

(load-file "/Users/rahult/Dropbox/Development/Clojure/fp-oo/sources/add-and-make.clj")

(def add
  (fn [this point2]
    (Point (+ (x this) (x point2))
           (+ (y this) (y point2)))))

(add (Point 1 2) (Point 2 3))

(def add
  (fn [this point2]
    (shift this (x point2) (y point2))))

(add (Point 1 2) (Point 2 3))

(def make
  (fn [& args]
    (eval (cons (first args) (rest args)))))

(make Point 1 2)

(make Triangle (make Point 1 2)
               (make Point 1 3)
               (make Point 3 1))

(def equal-triangles?
  (fn [& args]
    (apply = args)))

(equal-triangles? right-triangle right-triangle)
(equal-triangles? right-triangle equal-right-triangle)
(equal-triangles? right-triangle different-triangle)

(= right-triangle equal-right-triangle different-triangle)

(equal-triangles? right-triangle
                  equal-right-triangle
                  different-triangle)

(def valid-triangle?
  (fn [& args]
    (= (count (distinct args)) (count args))))

(valid-triangle? (Point 1 2) (Point 1 2) (Point 1 1))
(valid-triangle? (Point 1 2) (Point 1 4) (Point 1 1))





































