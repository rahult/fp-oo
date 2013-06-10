;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(let [name (+ 1 2)]
  (* name name))

(+ 1 (let [one 1] (* one one)) 3)

(let [one 1 two 2] (+ one two))

(let [little-map {:a 1} bigger-map (assoc little-map :b 2)]
  bigger-map)

(fn [starting-map]
  (let [bigger-map (assoc starting-map :b 2)
        overridden-a (assoc bigger-map :a 33)]
    overridden-a))

(def starting-map {:a 1})

(def bigger-map (assoc starting-map :b 2))

bigger-map

(assoc bigger-map :a 33)

(def Point
{
  :__own_symbol__ 'Point
  :__instance_methods__
  {
    :class-name :__class_symbol__
    :class
    (fn [this]
      class-from-instance this)
    :add-instance-values
    (fn [this x y]
      (assoc this :x x :y y))

    :shift
    (fn [this xinc yinc]
      (make Point (+ (:x this) xinc)
                 (+ (:y this) yinc)))
  }
})

(:__own_symbol__ Point)


(let [allocated {}]
  (assoc allocated :__class_symbol__ (:__own_symbol__ Point))
  allocated
  )

(def make
  (fn [class & args]
    (let [seeded {:__class_symbol__ (:__own_symbol__ class)}
          constructor (:add-instance-values (:__instance_methods__ class))
          finished-instance {}]
      (apply constructor seeded args)
)))

(make Point 1 2)

(def send-to
  (fn [instance message & args]
    (let [class (eval (:__class_symbol__ instance))
          method (message (:__instance_methods__ class))]
      (apply method instance args))))

(send-to (make Point 1 2) :shift -2 -3)

(def method-from-message
  (fn [message class]
    (message (:__instance_methods__ class))))

(method-from-message :add-instance-values Point)

(def class-from-instance
     (fn [instance]
       (eval (:__class_symbol__ instance))))

(class-from-instance (make Point 1 2))

(def apply-message-to
     (fn [class instance message args]
       (apply (method-from-message message class) instance args)))

(apply-message-to Point (make Point 1 2) :shift [1 3])

(def make
  (fn [class & args]
    (let [seeded {:__class_symbol__ (:__own_symbol__ class)}]
      (apply-message-to class seeded :add-instance-values args))))

(make Point 1 2)

(def send-to
  (fn [instance message & args]
    (let [class (eval (:__class_symbol__ instance))]
      (apply-message-to class instance message args))))

(send-to (make Point 1 2) :shift -2 -3)

(def point (make Point 1 2))

(send-to point :class-name)

(send-to point :class)

((:class-name (:__instance_methods__ Point)) (make Point 1 2))
