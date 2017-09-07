(ns exercise3)

(defn fibonacci
  "Does some math calculation."
  [x]
   (if (= x 0) 0 
	(if (= x 1) 1 
	(+ (fibonacci (- x 1)) 
     (fibonacci (- x 2)) ))))

; (ns exercise3)
;
;(defn fibonacci
;  "ejecuta la funcion de."
;  [x]
;	(if (<= x 0)
;		0
;	(if (= x 1)
;		1 
;	(+ (fibonacci (- x 1))
;		( fibonacci (- x 2))
;
;))))	 
 

