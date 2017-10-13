(ns com.zws.clj.main
  ;这里可以直接使用这个函数了，引入到当前命名空间来了
  (:use [com.zws.clj.child :only (make-anomyous-testintf)])
  ;后面使用zws2的函数一定要加上前缀zws2/
  (:require [com.zws.clj.test2 :as zws2])

  ;下面的:refer一定需要require
  (:require [com.zws.clj.test3 :as zws3])
  (:refer com.zws.clj.test3 :only [make-anomyous-testintf3])
  (:gen-class)
  (:import (java.util LinkedHashMap)))

(def aaa (make-anomyous-testintf ))
(def hhh (LinkedHashMap. 20))
(defn -main []
(println "hello world")
(let [n (make-anomyous-testintf )
      sss "zhangwusheng"
      ]
  (println sss)
  (println (str n) )
  (.sayHello n)
  (println (.satHello2 n  "zws11" ))
  )

  (let [n2 (zws2/make-anomyous-testintf2) ]
    ( .sayHello n2 )

    )


  (let [n3 (zws3/make-anomyous-testintf3) ]
    ( .sayHello n3 )

    )
  ( .sayHello aaa)

      (.put hhh 1 "zhang")
      (.put hhh 2 "wusheng")

  (let [ b (into {} hhh)]
    (println (str b))
    )

  )
