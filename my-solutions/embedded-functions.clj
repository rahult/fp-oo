;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(def make
  (fn [type & args]
    (apply type args)))


(def send-to
  (fn [object message & args]
    (apply (message (:__methods__ object)) object args)))



(def Point
  (fn [x y]
    {;; initializing instance variables
     :x x
     :y y

     ;; Metadata
     :__class_symbol__ 'Point
     :__methods__ {
       :x :x
       :y :y
       :class :__class_symbol__
       :shift
          (fn [this xinc yinc]
                (make Point (+ (send-to this :x) xinc)
                            (+ (send-to this :y) yinc)))
       :add
          (fn [this other]
                 (send-to this :shift (send-to other :x)
                                      (send-to other :y)))
       }}))


(send-to (make Point 1 2) :shift -2 -3)