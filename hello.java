(deftemplate problem1 (slot problem_1)  (slot solution_1)  )
(deftemplate problem2 (slot problem_2)  (slot solution_2)  )
(deftemplate problem3 (slot problem_3)  (slot solution_3)  )
(deftemplate problem4 (slot problem_4)  (slot solution_4)  )
(deftemplate problem5 (slot problem_5)  (slot solution_5)  )
(deftemplate problem6 (slot problem_6)  (slot solution_6)  )
(deftemplate problem7 (slot problem_7)  (slot solution_7)  )
(deftemplate problem8 (slot problem_8)  (slot solution_8)  )
(deftemplate problem9 (slot problem_9)  (slot solution_9)  )



(deffacts diabites
(problem1 (problem_1 "tired")                     (solution_1 "be comfort") )
(problem2 (problem_2 "thirsty")                   (solution_2 "drink water") )
(problem3 (problem_3 "hungry")                    (solution_3 "eat") )
(problem4 (problem_4 "blurry vision")             (solution_4 "wear glasses") )
(problem5 (problem_5 "tingling hands")            (solution_5 "go doctor") )
(problem6 (problem_6 "tingling feets")            (solution_6 "go doctor") )
(problem7 (problem_7 "dry skin")                  (solution_7 "witting") )
(problem8 (problem_8 "sores that heal slowly")    (solution_8 "take medicine") )
(problem9 (problem_9 "more infections than usual")(solution_9 "see doctor") ))




(defrule problem1
(problem1  (problem_1 ?problem_1)  (solution_1 ?solution_1))
				 =>
				 (assert (problem1 (problem_1 ?problem_1) (solution_1 ?solution_1)))
				 (printout t "If " ?problem_1 " then you must " ?solution_1  crlf)
 )
 (defrule problem2
                 (problem2  (problem_2 ?problem_2)  (solution_2 ?solution_2))
				 =>
				 (assert (problem2 (problem_2 ?problem_2) (solution_2 ?solution_2)))
				 (printout t "If " ?problem_2 " then you must " ?solution_2  crlf)
 )
 (defrule problem3
                 (problem3  (problem_3 ?problem_3)  (solution_3 ?solution_3))
				 =>
				 (assert (problem3 (problem_3 ?problem_3) (solution_3 ?solution_3)))
				 (printout t "If " ?problem_3 " then you must " ?solution_3  crlf)
 )
 (defrule problem4
                 (problem4  (problem_4 ?problem_4)  (solution_4 ?solution_4))
				 =>
				 (assert (problem4 (problem_4 ?problem_4) (solution_4 ?solution_4)))
				 (printout t "If " ?problem_4 " then you must " ?solution_4  crlf)
 )
 (defrule problem5
                 (problem5  (problem_5 ?problem_5)  (solution_5 ?solution_5))
				 =>
				 (assert (problem5 (problem_5 ?problem_5) (solution_5 ?solution_5)))
				 (printout t "If " ?problem_5 " then you must " ?solution_5  crlf)
 )
 (defrule problem6
                 (problem6  (problem_6 ?problem_6)  (solution_6 ?solution_6))
				 =>
				 (assert (problem6 (problem_6 ?problem_6) (solution_6 ?solution_6)))
				 (printout t "If " ?problem_6 " then you must " ?solution_6  crlf)
 )
 (defrule problem7
                 (problem7  (problem_7 ?problem_7)  (solution_7 ?solution_7))
				 =>
				 (assert (problem7 (problem_7 ?problem_7) (solution_7 ?solution_7)))
				 (printout t "If " ?problem_7 " then you must " ?solution_7  crlf)
 )
 (defrule problem8
                 (problem8  (problem_8 ?problem_8)  (solution_8 ?solution_8))
				 =>
				 (assert (problem8 (problem_8 ?problem_8) (solution_8 ?solution_8)))
				 (printout t "If " ?problem_8 " then you must " ?solution_8  crlf)
 )
 (defrule problem9
                 (problem9  (problem_9 ?problem_9)  (solution_9 ?solution_9))
				 =>
				 (assert (problem9 (problem_9 ?problem_9) (solution_9 ?solution_9)))
				 (printout t "If " ?problem_9 " then you must " ?solution_9  crlf)
 )

