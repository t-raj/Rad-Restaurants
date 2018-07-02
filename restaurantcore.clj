(ns hw2.core)

; string of attributes in the database users can search by
(def options "Rogers Park, Evanston, Loop, Lakeview, Old Town, Wicker Park, affordable, mid range, high end, coffee, fast food, American, Mexican, Italian, Indian, Chinese, Thai, Japanese, Latin, African, Arabic, Mediterranean, German, French, Baltic, experimental, steakhouse, pizza, breakfast, lunch, dinner, 24 hour, late night, casual, hipster, elegant, bar, sports, lively, private, scenic, outdoor, made to order, delivery, family, vintage, interactive, busy, communal, 1 star, 2 stars, 3 stars, 4 stars, 5 stars, open mic, music, all ages, 21+, 18+, weekdays, weekends, deals, membership, vegetarian, vegan, gluten free, nut allergies, lactose free, allergy conscious, alcohol, parking, authentic")

;(def db {
;:The-Coffee-Shop {"Rogers Park" "affordable" "coffee" "casual" "hipster" "vintage" "4 stars" "open mic" "music" "all ages" "weekdays" "weekends" "breakfast" "lunch" "dinner" "deals" "vegetarian" "made to order"},

;:Tiffin {"Rogers Park" "mid range" "Indian" "elegant" "4 stars" "all ages" "weekdays" "weekends" "breakfast" "lunch" "dinner" "vegetarian" "made to order" "alcohol"},

;:Adobo-Grill {"Old Town" "mid range" "Mexican" "lively" "4 stars" "all ages" "weekdays" "weekends" "lunch" "dinner" "vegetarian" "gluten free" "alcohol" "parking" "authentic" "deals"},

;:Felices {"Rogers Park" "affordable" "pizza" "experimental" "casual" "hipster" "4 stars" "all ages" "weekdays" "weekends" "lunch" "dinner" "vegetarian" "deals"}})


; database of restaurants matching each attribute. 
; Attributes without matching resaurants aren't included because their value would be nil anyway
(def db {
   :Rogers_Park "The Coffee Shop, Tiffin, Felices",
   :Old_Town "Adobo Grill",
   :affordable "The Coffee Shop, Felices",
   :mid_range "Tiffin, Adobo Grill",
   :coffee "The Coffee Shop",
   :Indian "Tiffin",
   :Mexican "Adobo Grill",
   :pizza "Felices",
   :casual "The Coffee Shop, Felices",
   :4_stars "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :hipster "The Coffee Shop, Felices",
   :lively "Adobo Grill",
   :elegant "Tiffin",
   :all_ages "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :vintage "The Coffee Shop",
   :weekdays "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :weekends "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :open_mic "The Coffee Shop",
   :breakfast "The Coffee Shop, Tiffin",
   :lunch "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :dinner "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :deals "The Coffee Shop, Felices, Adobo Grill",
   :vegetarian "The Coffee Shop, Tiffin, Felices, Adobo Grill",
   :made_to_order "The Coffee Shop, Tiffin",
   :alcohol "Tiffin, Adobo Grill",
   :authentic "Tiffin, Adobo Grill",
   :gluten_free "Adobo Grill",
   :parking "Adobo Grill"
   
         })

; prints out the list of attributes users can search by and directions for using the UI 
; reads in user's choice and prints matching restaurants. Currently commented out due to read-line error.
  (println "Welcome to Rad Restaurants, your one-stop shop to find restaurants catered to your unique needs and desires.")
  (println " ")
  (println "Enter a category from the following list.")
  (println " ")
  (println options)
  ;(println (get db (read-line)))

; I originally wanted to use this DB instead with restaurants as keys.
; It would be easier to add new restaurants to.
; Decided against this because I couldn't find an easy way to parse through a restaurant's attribute list.
;(def db {
;:The-Coffee-Shop {"Rogers Park" "affordable" "coffee" "casual" "hipster" "vintage" "4 stars" "open mic" "music" "all ages" "weekdays" "weekends" "breakfast" "lunch" "dinner" "deals" "vegetarian" "made to order"},

;:Tiffin {"Rogers Park" "mid range" "Indian" "elegant" "4 stars" "all ages" "weekdays" "weekends" "breakfast" "lunch" "dinner" "vegetarian" "made to order" "alcohol"},

;:Adobo-Grill {"Old Town" "mid range" "Mexican" "lively" "4 stars" "all ages" "weekdays" "weekends" "lunch" "dinner" "vegetarian" "gluten free" "alcohol" "parking" "authentic" "deals"},

;:Felices {"Rogers Park" "affordable" "pizza" "experimental" "casual" "hipster" "4 stars" "all ages" "weekdays" "weekends" "lunch" "dinner" "vegetarian" "deals"}})

; I attempted to create a filter users could add to and delete from. Proved tedious with immutable types.
; The includes function would find all restaurants in the commented out DB above matching all values in the filter.
; So far it searches for the whole filter as 1 chunk. It would have to search for individual attributes separately.
;(def fil nil) 
;(while (not(contains? filtr 0)) 
 ;(println "Enter a category from the following list and press the enter key to add it to your filter or enter 0 to quit.")
 ;  (println options)
   ;(conj filtr addition))
;(defn includes [restaurant attribute] (cond (contains? restaurant attribute) (println restaurant)))
;(conj (includes (first db) fil) (includes (rest db) fil))

; testing. Prints out restaurants matching attributes chosen.
(println " ")
(println "Old Town")
(println (get db :Old_Town))
(println " ")

(println "affordable")
(println (get db :affordable))
(println " ")

(println "Gluten Free")
(println (get db :gluten_free))
(println " ")

(println "4 stars")
(println (get db :4_stars))
(println " ")

(println "deals")
(println (get db :deals))

;(uifunc db, filtr)


