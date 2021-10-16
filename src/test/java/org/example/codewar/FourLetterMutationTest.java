package org.example.codewar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourLetterMutationTest {

  @Test
  void mutations() {
    String[] alice =
        new String[] {
          "plat", "rend", "bear", "soar", "mare", "pare", "flap", "neat", "clan", "pore"
        };
    String[] bob =
        new String[] {
          "boar", "clap", "mere", "lend", "near", "peat", "pure", "more", "plan", "soap"
        };
    assertEquals(
        0, FourLetterMutation.mutations(alice, bob, "maze", 0)); // Alice goes  first, Alice   wins
    assertEquals(
        -1, FourLetterMutation.mutations(alice, bob, "apse", 0)); // Alice fails first, neither wins
    assertEquals(
        1, FourLetterMutation.mutations(alice, bob, "neat", 1)); // Bob   goes  first, Bob     wins
    assertEquals(
        0, FourLetterMutation.mutations(alice, bob, "more", 1)); // Bob   fails first, Alice   wins
    assertEquals(
        -1, FourLetterMutation.mutations(alice, bob, "calm", 1)); // Bob   fails first, neither wins
    assertEquals(
        1, FourLetterMutation.mutations(alice, bob, "boat", 0)); // Alice fails first, Bob     wins
    assertEquals(
        1, FourLetterMutation.mutations(alice, bob, "send", 0)); // Alice goes  first, Bob     wins
    assertEquals(
        0, FourLetterMutation.mutations(alice, bob, "soar", 1)); // Bob   goes  first, Alice   wins
  }

  @Test
  void moreMutation() {
    String[] alice =
        new String[] {
          "bear", "hemp", "braw", "seek", "mime", "gals", "hops", "neon", "mows", "bigs", "tabu",
          "laky", "naos", "dona", "evil", "soja", "boxy", "spot", "lore", "trog", "tins", "yoga",
          "yins", "nibs", "pice", "peri", "hive", "suet", "zany", "dels", "rare", "pfui", "toph",
          "curl", "spun", "spud", "vrow", "sick", "nigh", "emmy", "wale", "path", "stir", "amid",
          "fate", "deus", "illy", "arbs", "twit", "deva", "jean", "pong", "wove", "toyo", "yald",
          "tell", "dish", "dado", "lord", "slob", "saga", "lace", "meld", "ramp", "smew", "errs",
          "aeon", "tats", "doll", "oryx", "howe", "hits", "note", "veer", "opus", "naif", "fons",
          "made", "oses", "stun", "elds", "emma", "sika", "polk", "quod", "sulu", "jars", "gala",
          "glad", "goer", "sizy", "burp", "esne", "puli", "maim", "ankh", "abye", "dodo", "wold",
          "agee"
        };
    String[] bob =
        new String[] {
          "lari", "upon", "chut", "cepe", "tyro", "frow", "tref", "limn", "maim", "each", "kiev",
          "some", "oyes", "koas", "paps", "guns", "jump", "gigs", "hash", "ably", "bear", "spur",
          "wail", "slam", "wyle", "whid", "mark", "rush", "jauk", "heil", "rued", "purs", "deed",
          "gasp", "ebbs", "unai", "fido", "tilt", "owns", "dell", "sibb", "yaff", "shes", "zinc",
          "nixy", "kame", "nosh", "gamb", "fyke", "fane", "glom", "husk", "just", "soca", "milt",
          "ands", "ilks", "otto", "jute", "diet", "gapy", "went", "merl", "eggy", "paws", "meno",
          "grim", "aqua", "cozy", "lych", "lets", "hyla", "sops", "diel", "kyes", "isba", "nosy",
          "moas", "caff", "bead", "waes", "sark", "moor", "boys", "pula", "nett", "boar", "flew",
          "work", "meal", "base", "tabu", "ribs", "rink", "evil", "fere", "keet", "salp", "west",
          "stat"
        };

    assertEquals(
        1, FourLetterMutation.mutations(alice, bob, "soar", 0)); // Bob   goes  first, Alice   wins
  }

  @Test
  void moreMutation2() {
    String[] bob =
        new String[] {
          "tapa", "hype", "geed", "malm", "holp", "balm", "coco", "dogy", "ankh", "carp", "aqua",
          "zees", "tivy", "drub", "pain", "jinx", "ghee", "yeas", "unbe", "bile", "juku", "glad",
          "aces", "calm", "gaga", "hale", "awee", "emmy", "sump", "hade", "cuff", "gawp", "dray",
          "riff", "jiao", "hulk", "malt", "dont", "rugs", "rato", "loon", "floc", "jean", "sots",
          "toom", "mhos", "aits", "boor", "lane", "macs", "acme", "tore", "gear", "lows", "iffy",
          "negs", "lych", "sook", "vest", "jars", "soma", "pial", "tour", "bisk", "milt", "olid",
          "hide", "with", "bibb", "slop", "hock", "obas", "maun", "urge", "waul", "sunn", "irid",
          "tilt", "alef", "loup", "rems", "sing", "hams", "bute", "jimp", "bine", "futz", "snaw",
          "peek", "yawp", "hang", "oiks", "belt", "lite", "spud", "glut", "pood", "turn", "java",
          "glob", "oyer", "emes", "wick", "axal", "hisn", "pili", "etas", "tuft", "mojo", "ajee",
          "jobs", "mime", "dino", "jest", "late", "lorn", "minx", "oils", "gaud", "ruer", "difs",
          "bins", "pout", "mugg", "otic", "chai", "anoa", "naps", "eves", "wool", "pina", "blet",
          "ride", "revs", "worm", "whet", "swat", "yuke", "aria", "oaky", "yips", "sell", "plum",
          "balk", "blab", "hire", "clew", "gids", "mosh", "fane", "trim", "pula", "beta", "flip",
          "want", "ryke", "roil", "amin", "burb", "rite", "geum", "heft", "pate", "maxi", "weak",
          "leis", "glue", "spat", "begs", "owly", "naan", "dees", "over", "cees", "nope", "fats",
          "fuds", "mosk", "jarl", "saps", "lull", "tabs", "vims", "woad", "lacy", "maws", "kiwi",
          "roms", "gits", "lore", "hors", "lays", "cris", "bags", "lice", "mott", "devs", "rhus",
          "sods", "ogee"
        };
    String[] alice =
        new String[] {
          "mice", "rues", "dere", "maws", "waws", "lien", "pony", "pian", "jota", "lots", "book",
          "scow", "amid", "emus", "test", "pent", "taut", "gorp", "lost", "kino", "meal", "moth",
          "sate", "pave", "croc", "tome", "sops", "ceil", "fair", "moas", "fizz", "hunk", "mate",
          "nowt", "vaws", "whup", "fiat", "yawl", "buff", "errs", "kifs", "surf", "sexy", "vids",
          "byre", "tide", "wost", "tres", "knit", "devs", "opal", "hick", "reds", "palp", "lutz",
          "pall", "imid", "nock", "dial", "albs", "tire", "mown", "dreg", "hush", "seis", "jaws",
          "keet", "ryes", "cony", "duel", "bene", "mugs", "perp", "spin", "shun", "esne", "vino",
          "does", "peek", "crag", "coly", "wood", "qadi", "joky", "lehr", "bubu", "amyl", "naan",
          "byes", "slap", "core", "pods", "mids", "inky", "dows", "seel", "turn", "recs", "thru",
          "gams", "beep", "pout", "dour", "olla", "toph", "dual", "offs", "tody", "ebbs", "halm",
          "wigs", "kiln", "moss", "umph", "keta", "knar", "nard", "tund", "ulan", "tyer", "fice",
          "till", "mils", "host", "birk", "rees", "earl", "brrr", "tact", "call", "yill", "sump",
          "spat", "dale", "mire", "olea", "line", "vase", "such", "teas", "stud", "pein", "fell",
          "mool", "gowd", "tabs", "kays", "brux", "lyes", "pood", "karn", "ruse", "ryot", "eyot",
          "boot", "mask", "pyas", "fobs", "vide", "whim", "lyse", "nema", "rang", "gyri", "nogg",
          "cabs", "part", "coni", "gane", "alar", "aper", "text", "teen", "dels", "knag", "rank",
          "bals", "adit", "tole", "mojo", "volt", "acta", "wist", "dhal", "gals", "lice", "daff",
          "loid", "note", "thug", "bops", "fuse", "holt", "band", "shoo", "rube", "elks", "rare",
          "shay", "fain"
        };

    assertEquals(
        -1, FourLetterMutation.mutations(alice, bob, "then", 0)); // Bob   goes  first, Alice   wins
  }

  @Test
  void moreMutation3() {
    String[] alice =
        new String[] {
          "loid", "ends", "solo", "yoks", "bloc", "yeti", "gied", "brat", "eath", "pina", "opal",
          "oven", "jigs", "auld", "pyas", "diel", "bawd", "dolt", "kiwi", "kudu", "pont", "pita",
          "dine", "weir", "birk", "darn", "smug", "care", "gyro", "ayin", "fuss", "corf", "ikat",
          "once", "oint", "flip", "maud", "boho", "mise", "meme", "seen", "toph", "inch", "weld",
          "liny", "beam", "ilex", "cees", "buts", "feeb", "afro", "yoke", "cagy", "germ", "oops",
          "sold", "kemp", "base", "pins", "sice", "loud", "yaud", "must", "fins", "jazz", "deni",
          "veep", "tipi", "moue", "joys", "bust", "cope", "deco", "sits", "jinx", "nema", "eros",
          "tilt", "mess", "alec", "nome", "drek", "mush", "yips", "wart", "pyro", "jobs", "etna",
          "bald", "pase", "caps", "slub", "lard", "arch", "duke", "bufo", "epha", "craw", "kris",
          "raft"
        };

    String[] bob =
        new String[] {
          "jaup", "eats", "tent", "scry", "anes", "whet", "sons", "hike", "unto", "whim", "fled",
          "trow", "abri", "jean", "tils", "gybe", "sulu", "kelt", "zill", "mony", "zonk", "bets",
          "hols", "colt", "does", "kuru", "knag", "bind", "bite", "scum", "thio", "laud", "eses",
          "luna", "rhos", "tale", "nebs", "toff", "clog", "teed", "sigh", "from", "pack", "ryot",
          "hilt", "anon", "fang", "vino", "dude", "hews", "phut", "mano", "rack", "lung", "aped",
          "chug", "grat", "spiv", "term", "yogi", "char", "sera", "orra", "axes", "sane", "snot",
          "bubs", "zouk", "weta", "fyke", "zone", "text", "yaud", "wyte", "look", "judo", "guan",
          "card", "tool", "orbs", "memo", "asea", "lust", "yuca", "ires", "inro", "obol", "lift",
          "hied", "darn", "soak", "luce", "jamb", "hock", "tete", "busy", "kiln", "page", "faun",
          "uses"
        };

    assertEquals(
        -1, FourLetterMutation.mutations(alice, bob, "ment", 1)); // Bob   goes  first, Alice   wins
  }
}
