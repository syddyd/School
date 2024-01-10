public class ECard {
    enum eCard{
        ACEOFSPADES, ONEOFSPADES, TWOOFSPADES, ETC
    }

    //it is not valuable for me to do this 52 times
    /* answer to question 2: this is an inferior solution to the example which had enum types for the rank
       and the suit separately. It is worse because if we think about what we theoretically need for the
       game to work, it is probably suit and rank. It would be easier to implement functions if those two
       attributes were represented separately, so that we could have getter functions that could easily
       tell us what they are. ACEOFSPADES is just 1 random card out of 52.
     */

}
