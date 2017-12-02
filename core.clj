(ns consoleclojure.core
  (:gen-class)
  (:require [clojure.string :as str] 
            [clojure.edn :as edn]
            [clojure.pprint :as pp]))



(defn epa []
  (println "epa"))
 
(def userpoints 11); user points
;(def listo (reador filero)); lixta
(def truzao true)

(def pecapero 1)

(defn reador [filerboy];filerboy = file
  (with-open [rdr (clojure.java.io/reader filerboy)]; read file
    (reduce conj [] (line-seq rdr))));


(defn- first-word  [pcap filerboy];points and filename
  
  (def lixta(reador filerboy)); read file
  (def tesuto (nth lixta 0))
  (def tesuto  (shuffle (seq tesuto)))
  
  (while (= truzao true)
    (do 
      (println "---     "   tesuto "   ------");prints the word from file
      
      (println "--- Degete ---")
      (let [userinput (read-line)];get user input
        (if (not= (some #{userinput} lixta) nil); if user input its on the list
          (do (println "Ponto pra vc ")
            (def userpoints (inc userpoints)); increments user points
            (def lixta (remove #{userinput} lixta));remove anwsr from list
            (println userpoints))
          (println "NOPE NOPE HOME BOY"))));else
    
    
    (if ( >= userpoints pcap)
      (do (println "5 pontos.|k| pra continuar nesta. |n| proxima palavra")
        (let [anotherinput (read-line)]
          (if (= anotherinput "n")
            (def truzao false)
            (println "continuemos")))))))










(defn -main [y] ;;receber true or false pro while pra sair depois quando chamar de novo na recurcao
  (println "-------------------------------------")
  (println "--------SUCH LETRA MUCH TROCA--------")

  (def filero "p1.txt")
  (def filero2 "p2.txt")
  (def filero3 "p3.txt")
  (def filero4 "p4.txt")
  (def filero5 "p5.txt")
  (def filero6 "p6.txt")
  (def the-lista (seq [filero filero2 filero3 filero4 filero5 filero6])); all files into a seq
  
  
  (def the-lista (shuffle the-lista));shuffle na ordem dos files
  
  (def all-true true)  
  (def myatom (atom (first the-lista)))
  (while (= all-true true) 
    
      (println "---- Digite start para começar ----")
      (println "---- Digite quit para sair    ----")
      
      (let [input (read-line)];pega input 
        (if (= input "start")
          (do
            
            (first-word pecapero @myatom);chama func passa numero de pontos e o txt
            ;(def l-lista (remove #{fik} the-lista))
            
            (def the-lista (remove #{(first the-lista)} the-lista)); remove o primero da the-lista
            (if (empty? the-lista); se a the lista estiver vazia
              (do 
                (println)
                (println "Fim dos arquivos veja sua pontuacao")
                (println "------>" userpoints "<----- Pontos")
                (println)
                (def all-true false)))
                ;(def x (+ x 100))))
                ;(System/exit 0))); end game
            (reset! myatom (first the-lista));myatom recebe o primero da lista
            ;(println the-lista)
            ;(println @myatom)
            (def pecapero (+ pecapero 2));incrementa  o pecapero
            (def truzao true))
          (do
            (def all-true false)))))
            
          
          ;(System/exit 0))))  
  
  (epa)
  ;(first-word 5 filero)
  (def all-true true)
  (def inp (-main true))
  (println inp)
  (if (= inp "quit")
    (do
      (println "------>" userpoints "<----- Pontos")
      (println "WE'RE OUT BOYS !!")
      (System/exit 0)))
  (def all-true false)
  (println "------>" userpoints "<----- Pontos")
  (println "WE'RE OUT BOYS !!")) 
    
 
  
  
  
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  



