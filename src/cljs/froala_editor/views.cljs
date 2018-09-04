(ns froala-editor.views
  (:require
   [re-frame.core :as re-frame]
   [froala-editor.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 @name " WYSIWYG"]
    [:editor]
     ]))
