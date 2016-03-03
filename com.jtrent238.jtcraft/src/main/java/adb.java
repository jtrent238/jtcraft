/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adb
/*     */ {
/*  35 */   public static final cw e = new cw();
/*     */   
/*  37 */   protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private abt a;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int b(adb paramadb)
/*     */   {
/*  49 */     return paramadb == null ? 0 : e.b(paramadb);
/*     */   }
/*     */   
/*     */   public static adb d(int paramInt) {
/*  53 */     return (adb)e.a(paramInt);
/*     */   }
/*     */   
/*     */   public static adb a(aji paramaji) {
/*  57 */     return d(aji.b(paramaji));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 128 */   protected static Random g = new Random();
/*     */   
/*     */   public static void l()
/*     */   {
/* 132 */     e.a(256, "iron_shovel", new ady(adc.c).c("shovelIron").f("iron_shovel"));
/* 133 */     e.a(257, "iron_pickaxe", new adn(adc.c).c("pickaxeIron").f("iron_pickaxe"));
/* 134 */     e.a(258, "iron_axe", new abf(adc.c).c("hatchetIron").f("iron_axe"));
/* 135 */     e.a(259, "flint_and_steel", new acw().c("flintAndSteel").f("flint_and_steel"));
/* 136 */     e.a(260, "apple", new acx(4, 0.3F, false).c("apple").f("apple"));
/* 137 */     e.a(261, "bow", new abm().c("bow").f("bow"));
/* 138 */     e.a(262, "arrow", new adb().c("arrow").a(abt.j).f("arrow"));
/* 139 */     e.a(263, "coal", new abq().c("coal").f("coal"));
/* 140 */     e.a(264, "diamond", new adb().c("diamond").a(abt.l).f("diamond"));
/* 141 */     e.a(265, "iron_ingot", new adb().c("ingotIron").a(abt.l).f("iron_ingot"));
/* 142 */     e.a(266, "gold_ingot", new adb().c("ingotGold").a(abt.l).f("gold_ingot"));
/* 143 */     e.a(267, "iron_sword", new aeh(adc.c).c("swordIron").f("iron_sword"));
/* 144 */     e.a(268, "wooden_sword", new aeh(adc.a).c("swordWood").f("wood_sword"));
/* 145 */     e.a(269, "wooden_shovel", new ady(adc.a).c("shovelWood").f("wood_shovel"));
/* 146 */     e.a(270, "wooden_pickaxe", new adn(adc.a).c("pickaxeWood").f("wood_pickaxe"));
/* 147 */     e.a(271, "wooden_axe", new abf(adc.a).c("hatchetWood").f("wood_axe"));
/* 148 */     e.a(272, "stone_sword", new aeh(adc.b).c("swordStone").f("stone_sword"));
/* 149 */     e.a(273, "stone_shovel", new ady(adc.b).c("shovelStone").f("stone_shovel"));
/* 150 */     e.a(274, "stone_pickaxe", new adn(adc.b).c("pickaxeStone").f("stone_pickaxe"));
/* 151 */     e.a(275, "stone_axe", new abf(adc.b).c("hatchetStone").f("stone_axe"));
/* 152 */     e.a(276, "diamond_sword", new aeh(adc.d).c("swordDiamond").f("diamond_sword"));
/* 153 */     e.a(277, "diamond_shovel", new ady(adc.d).c("shovelDiamond").f("diamond_shovel"));
/* 154 */     e.a(278, "diamond_pickaxe", new adn(adc.d).c("pickaxeDiamond").f("diamond_pickaxe"));
/* 155 */     e.a(279, "diamond_axe", new abf(adc.d).c("hatchetDiamond").f("diamond_axe"));
/* 156 */     e.a(280, "stick", new adb().q().c("stick").a(abt.l).f("stick"));
/* 157 */     e.a(281, "bowl", new adb().c("bowl").a(abt.l).f("bowl"));
/* 158 */     e.a(282, "mushroom_stew", new abn(6).c("mushroomStew").f("mushroom_stew"));
/* 159 */     e.a(283, "golden_sword", new aeh(adc.e).c("swordGold").f("gold_sword"));
/* 160 */     e.a(284, "golden_shovel", new ady(adc.e).c("shovelGold").f("gold_shovel"));
/* 161 */     e.a(285, "golden_pickaxe", new adn(adc.e).c("pickaxeGold").f("gold_pickaxe"));
/* 162 */     e.a(286, "golden_axe", new abf(adc.e).c("hatchetGold").f("gold_axe"));
/* 163 */     e.a(287, "string", new abi(ajn.bD).c("string").a(abt.l).f("string"));
/* 164 */     e.a(288, "feather", new adb().c("feather").a(abt.l).f("feather"));
/* 165 */     e.a(289, "gunpowder", new adb().c("sulphur").e(aen.k).a(abt.l).f("gunpowder"));
/* 166 */     e.a(290, "wooden_hoe", new ada(adc.a).c("hoeWood").f("wood_hoe"));
/* 167 */     e.a(291, "stone_hoe", new ada(adc.b).c("hoeStone").f("stone_hoe"));
/* 168 */     e.a(292, "iron_hoe", new ada(adc.c).c("hoeIron").f("iron_hoe"));
/* 169 */     e.a(293, "diamond_hoe", new ada(adc.d).c("hoeDiamond").f("diamond_hoe"));
/* 170 */     e.a(294, "golden_hoe", new ada(adc.e).c("hoeGold").f("gold_hoe"));
/* 171 */     e.a(295, "wheat_seeds", new adw(ajn.aj, ajn.ak).c("seeds").f("seeds_wheat"));
/* 172 */     e.a(296, "wheat", new adb().c("wheat").a(abt.l).f("wheat"));
/* 173 */     e.a(297, "bread", new acx(5, 0.6F, false).c("bread").f("bread"));
/* 174 */     e.a(298, "leather_helmet", new abb(abd.a, 0, 0).c("helmetCloth").f("leather_helmet"));
/* 175 */     e.a(299, "leather_chestplate", new abb(abd.a, 0, 1).c("chestplateCloth").f("leather_chestplate"));
/* 176 */     e.a(300, "leather_leggings", new abb(abd.a, 0, 2).c("leggingsCloth").f("leather_leggings"));
/* 177 */     e.a(301, "leather_boots", new abb(abd.a, 0, 3).c("bootsCloth").f("leather_boots"));
/* 178 */     e.a(302, "chainmail_helmet", new abb(abd.b, 1, 0).c("helmetChain").f("chainmail_helmet"));
/* 179 */     e.a(303, "chainmail_chestplate", new abb(abd.b, 1, 1).c("chestplateChain").f("chainmail_chestplate"));
/* 180 */     e.a(304, "chainmail_leggings", new abb(abd.b, 1, 2).c("leggingsChain").f("chainmail_leggings"));
/* 181 */     e.a(305, "chainmail_boots", new abb(abd.b, 1, 3).c("bootsChain").f("chainmail_boots"));
/* 182 */     e.a(306, "iron_helmet", new abb(abd.c, 2, 0).c("helmetIron").f("iron_helmet"));
/* 183 */     e.a(307, "iron_chestplate", new abb(abd.c, 2, 1).c("chestplateIron").f("iron_chestplate"));
/* 184 */     e.a(308, "iron_leggings", new abb(abd.c, 2, 2).c("leggingsIron").f("iron_leggings"));
/* 185 */     e.a(309, "iron_boots", new abb(abd.c, 2, 3).c("bootsIron").f("iron_boots"));
/* 186 */     e.a(310, "diamond_helmet", new abb(abd.e, 3, 0).c("helmetDiamond").f("diamond_helmet"));
/* 187 */     e.a(311, "diamond_chestplate", new abb(abd.e, 3, 1).c("chestplateDiamond").f("diamond_chestplate"));
/* 188 */     e.a(312, "diamond_leggings", new abb(abd.e, 3, 2).c("leggingsDiamond").f("diamond_leggings"));
/* 189 */     e.a(313, "diamond_boots", new abb(abd.e, 3, 3).c("bootsDiamond").f("diamond_boots"));
/* 190 */     e.a(314, "golden_helmet", new abb(abd.d, 4, 0).c("helmetGold").f("gold_helmet"));
/* 191 */     e.a(315, "golden_chestplate", new abb(abd.d, 4, 1).c("chestplateGold").f("gold_chestplate"));
/* 192 */     e.a(316, "golden_leggings", new abb(abd.d, 4, 2).c("leggingsGold").f("gold_leggings"));
/* 193 */     e.a(317, "golden_boots", new abb(abd.d, 4, 3).c("bootsGold").f("gold_boots"));
/* 194 */     e.a(318, "flint", new adb().c("flint").a(abt.l).f("flint"));
/* 195 */     e.a(319, "porkchop", new acx(3, 0.3F, true).c("porkchopRaw").f("porkchop_raw"));
/* 196 */     e.a(320, "cooked_porkchop", new acx(8, 0.8F, true).c("porkchopCooked").f("porkchop_cooked"));
/* 197 */     e.a(321, "painting", new acz(tb.class).c("painting").f("painting"));
/* 198 */     e.a(322, "golden_apple", new acy(4, 1.2F, false).j().a(rv.l.H, 5, 1, 1.0F).c("appleGold").f("apple_golden"));
/* 199 */     e.a(323, "sign", new adz().c("sign").f("sign"));
/* 200 */     e.a(324, "wooden_door", new ach(awt.d).c("doorWood").f("door_wood"));
/* 201 */     adb localadb = new abo(ajn.a).c("bucket").e(16).f("bucket_empty");
/* 202 */     e.a(325, "bucket", localadb);
/* 203 */     e.a(326, "water_bucket", new abo(ajn.i).c("bucketWater").c(localadb).f("bucket_water"));
/* 204 */     e.a(327, "lava_bucket", new abo(ajn.k).c("bucketLava").c(localadb).f("bucket_lava"));
/* 205 */     e.a(328, "minecart", new adj(0).c("minecart").f("minecart_normal"));
/* 206 */     e.a(329, "saddle", new adt().c("saddle").f("saddle"));
/* 207 */     e.a(330, "iron_door", new ach(awt.f).c("doorIron").f("door_iron"));
/* 208 */     e.a(331, "redstone", new ads().c("redstone").e(aen.i).f("redstone_dust"));
/* 209 */     e.a(332, "snowball", new aed().c("snowball").f("snowball"));
/* 210 */     e.a(333, "boat", new abj().c("boat").f("boat"));
/* 211 */     e.a(334, "leather", new adb().c("leather").a(abt.l).f("leather"));
/* 212 */     e.a(335, "milk_bucket", new adi().c("milk").c(localadb).f("bucket_milk"));
/* 213 */     e.a(336, "brick", new adb().c("brick").a(abt.l).f("brick"));
/* 214 */     e.a(337, "clay_ball", new adb().c("clay").a(abt.l).f("clay_ball"));
/* 215 */     e.a(338, "reeds", new abi(ajn.aH).c("reeds").a(abt.l).f("reeds"));
/* 216 */     e.a(339, "paper", new adb().c("paper").a(abt.f).f("paper"));
/* 217 */     e.a(340, "book", new abk().c("book").a(abt.f).f("book_normal"));
/* 218 */     e.a(341, "slime_ball", new adb().c("slimeball").a(abt.f).f("slimeball"));
/* 219 */     e.a(342, "chest_minecart", new adj(1).c("minecartChest").f("minecart_chest"));
/* 220 */     e.a(343, "furnace_minecart", new adj(2).c("minecartFurnace").f("minecart_furnace"));
/* 221 */     e.a(344, "egg", new ack().c("egg").f("egg"));
/* 222 */     e.a(345, "compass", new adb().c("compass").a(abt.i).f("compass"));
/* 223 */     e.a(346, "fishing_rod", new acv().c("fishingRod").f("fishing_rod"));
/* 224 */     e.a(347, "clock", new adb().c("clock").a(abt.i).f("clock"));
/* 225 */     e.a(348, "glowstone_dust", new adb().c("yellowDust").e(aen.j).a(abt.l).f("glowstone_dust"));
/* 226 */     e.a(349, "fish", new act(false).c("fish").f("fish_raw").a(true));
/* 227 */     e.a(350, "cooked_fished", new act(true).c("fish").f("fish_cooked").a(true));
/* 228 */     e.a(351, "dye", new acj().c("dyePowder").f("dye_powder"));
/* 229 */     e.a(352, "bone", new adb().c("bone").q().a(abt.f).f("bone"));
/* 230 */     e.a(353, "sugar", new adb().c("sugar").e(aen.b).a(abt.l).f("sugar"));
/* 231 */     e.a(354, "cake", new abi(ajn.aQ).e(1).c("cake").a(abt.h).f("cake"));
/* 232 */     e.a(355, "bed", new abg().e(1).c("bed").f("bed"));
/* 233 */     e.a(356, "repeater", new abi(ajn.aR).c("diode").a(abt.d).f("repeater"));
/* 234 */     e.a(357, "cookie", new acx(2, 0.1F, false).c("cookie").f("cookie"));
/* 235 */     e.a(358, "filled_map", new adh().c("map").f("map_filled"));
/* 236 */     e.a(359, "shears", new adx().c("shears").f("shears"));
/* 237 */     e.a(360, "melon", new acx(2, 0.3F, false).c("melon").f("melon"));
/* 238 */     e.a(361, "pumpkin_seeds", new adw(ajn.bb, ajn.ak).c("seeds_pumpkin").f("seeds_pumpkin"));
/* 239 */     e.a(362, "melon_seeds", new adw(ajn.bc, ajn.ak).c("seeds_melon").f("seeds_melon"));
/* 240 */     e.a(363, "beef", new acx(3, 0.3F, true).c("beefRaw").f("beef_raw"));
/* 241 */     e.a(364, "cooked_beef", new acx(8, 0.8F, true).c("beefCooked").f("beef_cooked"));
/* 242 */     e.a(365, "chicken", new acx(2, 0.3F, true).a(rv.s.H, 30, 0, 0.3F).c("chickenRaw").f("chicken_raw"));
/* 243 */     e.a(366, "cooked_chicken", new acx(6, 0.6F, true).c("chickenCooked").f("chicken_cooked"));
/* 244 */     e.a(367, "rotten_flesh", new acx(4, 0.1F, true).a(rv.s.H, 30, 0, 0.8F).c("rottenFlesh").f("rotten_flesh"));
/* 245 */     e.a(368, "ender_pearl", new aco().c("enderPearl").f("ender_pearl"));
/* 246 */     e.a(369, "blaze_rod", new adb().c("blazeRod").a(abt.l).f("blaze_rod"));
/* 247 */     e.a(370, "ghast_tear", new adb().c("ghastTear").e(aen.c).a(abt.k).f("ghast_tear"));
/* 248 */     e.a(371, "gold_nugget", new adb().c("goldNugget").a(abt.l).f("gold_nugget"));
/* 249 */     e.a(372, "nether_wart", new adw(ajn.bm, ajn.aM).c("netherStalkSeeds").e("+4").f("nether_wart"));
/* 250 */     e.a(373, "potion", new adp().c("potion").f("potion"));
/* 251 */     e.a(374, "glass_bottle", new abl().c("glassBottle").f("potion_bottle_empty"));
/* 252 */     e.a(375, "spider_eye", new acx(2, 0.8F, false).a(rv.u.H, 5, 0, 1.0F).c("spiderEye").e(aen.d).f("spider_eye"));
/*     */     
/*     */ 
/* 255 */     e.a(376, "fermented_spider_eye", new adb().c("fermentedSpiderEye").e(aen.e).a(abt.k).f("spider_eye_fermented"));
/* 256 */     e.a(377, "blaze_powder", new adb().c("blazePowder").e(aen.g).a(abt.k).f("blaze_powder"));
/* 257 */     e.a(378, "magma_cream", new adb().c("magmaCream").e(aen.h).a(abt.k).f("magma_cream"));
/* 258 */     e.a(379, "brewing_stand", new abi(ajn.bo).c("brewingStand").a(abt.k).f("brewing_stand"));
/* 259 */     e.a(380, "cauldron", new abi(ajn.bp).c("cauldron").a(abt.k).f("cauldron"));
/* 260 */     e.a(381, "ender_eye", new acn().c("eyeOfEnder").f("ender_eye"));
/* 261 */     e.a(382, "speckled_melon", new adb().c("speckledMelon").e(aen.f).a(abt.k).f("melon_speckled"));
/* 262 */     e.a(383, "spawn_egg", new aee().c("monsterPlacer").f("spawn_egg"));
/* 263 */     e.a(384, "experience_bottle", new acp().c("expBottle").f("experience_bottle"));
/* 264 */     e.a(385, "fire_charge", new acq().c("fireball").f("fireball"));
/* 265 */     e.a(386, "writable_book", new ael().c("writingBook").a(abt.f).f("book_writable"));
/* 266 */     e.a(387, "written_book", new aem().c("writtenBook").f("book_written").e(16));
/* 267 */     e.a(388, "emerald", new adb().c("emerald").a(abt.l).f("emerald"));
/* 268 */     e.a(389, "item_frame", new acz(st.class).c("frame").f("item_frame"));
/* 269 */     e.a(390, "flower_pot", new abi(ajn.bL).c("flowerPot").a(abt.c).f("flower_pot"));
/* 270 */     e.a(391, "carrot", new adv(4, 0.6F, ajn.bM, ajn.ak).c("carrots").f("carrot"));
/* 271 */     e.a(392, "potato", new adv(1, 0.3F, ajn.bN, ajn.ak).c("potato").f("potato"));
/* 272 */     e.a(393, "baked_potato", new acx(6, 0.6F, false).c("potatoBaked").f("potato_baked"));
/* 273 */     e.a(394, "poisonous_potato", new acx(2, 0.3F, false).a(rv.u.H, 5, 0, 0.6F).c("potatoPoisonous").f("potato_poisonous"));
/* 274 */     e.a(395, "map", new acl().c("emptyMap").f("map_empty"));
/* 275 */     e.a(396, "golden_carrot", new acx(6, 1.2F, false).c("carrotGolden").e(aen.l).f("carrot_golden"));
/* 276 */     e.a(397, "skull", new aeb().c("skull").f("skull"));
/* 277 */     e.a(398, "carrot_on_a_stick", new abp().c("carrotOnAStick").f("carrot_on_a_stick"));
/* 278 */     e.a(399, "nether_star", new aea().c("netherStar").a(abt.l).f("nether_star"));
/* 279 */     e.a(400, "pumpkin_pie", new acx(8, 0.3F, false).c("pumpkinPie").a(abt.h).f("pumpkin_pie"));
/* 280 */     e.a(401, "fireworks", new acs().c("fireworks").f("fireworks"));
/* 281 */     e.a(402, "firework_charge", new acr().c("fireworksCharge").a(abt.f).f("fireworks_charge"));
/* 282 */     e.a(403, "enchanted_book", new acm().e(1).c("enchantedBook").f("book_enchanted"));
/* 283 */     e.a(404, "comparator", new abi(ajn.bU).c("comparator").a(abt.d).f("comparator"));
/* 284 */     e.a(405, "netherbrick", new adb().c("netherbrick").a(abt.l).f("netherbrick"));
/* 285 */     e.a(406, "quartz", new adb().c("netherquartz").a(abt.l).f("quartz"));
/* 286 */     e.a(407, "tnt_minecart", new adj(3).c("minecartTnt").f("minecart_tnt"));
/* 287 */     e.a(408, "hopper_minecart", new adj(5).c("minecartHopper").f("minecart_hopper"));
/* 288 */     e.a(417, "iron_horse_armor", new adb().c("horsearmormetal").e(1).a(abt.f).f("iron_horse_armor"));
/* 289 */     e.a(418, "golden_horse_armor", new adb().c("horsearmorgold").e(1).a(abt.f).f("gold_horse_armor"));
/* 290 */     e.a(419, "diamond_horse_armor", new adb().c("horsearmordiamond").e(1).a(abt.f).f("diamond_horse_armor"));
/* 291 */     e.a(420, "lead", new adf().c("leash").f("lead"));
/* 292 */     e.a(421, "name_tag", new adm().c("nameTag").f("name_tag"));
/* 293 */     e.a(422, "command_block_minecart", new adj(6).c("minecartCommandBlock").f("minecart_command_block").a(null));
/* 294 */     e.a(2256, "record_13", new adr("13").c("record").f("record_13"));
/* 295 */     e.a(2257, "record_cat", new adr("cat").c("record").f("record_cat"));
/* 296 */     e.a(2258, "record_blocks", new adr("blocks").c("record").f("record_blocks"));
/* 297 */     e.a(2259, "record_chirp", new adr("chirp").c("record").f("record_chirp"));
/* 298 */     e.a(2260, "record_far", new adr("far").c("record").f("record_far"));
/* 299 */     e.a(2261, "record_mall", new adr("mall").c("record").f("record_mall"));
/* 300 */     e.a(2262, "record_mellohi", new adr("mellohi").c("record").f("record_mellohi"));
/* 301 */     e.a(2263, "record_stal", new adr("stal").c("record").f("record_stal"));
/* 302 */     e.a(2264, "record_strad", new adr("strad").c("record").f("record_strad"));
/* 303 */     e.a(2265, "record_ward", new adr("ward").c("record").f("record_ward"));
/* 304 */     e.a(2266, "record_11", new adr("11").c("record").f("record_11"));
/* 305 */     e.a(2267, "record_wait", new adr("wait").c("record").f("record_wait"));
/*     */     
/* 307 */     HashSet localHashSet = Sets.newHashSet(new aji[] { ajn.a, ajn.bo, ajn.C, ajn.bm, ajn.bp, ajn.bL, ajn.aj, ajn.aH, ajn.aQ, ajn.bP, ajn.K, ajn.M, ajn.ay, ajn.aS, ajn.bb, ajn.an, ajn.bV, ajn.bD, ajn.bv, ajn.bc, ajn.az, ajn.bU, ajn.af, ajn.as, ajn.aR, ajn.av, ajn.ao });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 337 */     for (String str : aji.c.b()) {
/* 338 */       aji localaji = (aji)aji.c.a(str);
/*     */       
/*     */       Object localObject;
/* 341 */       if (localaji == ajn.L) { localObject = new aek(ajn.L).b("cloth");
/* 342 */       } else if (localaji == ajn.ce) { localObject = new aek(ajn.ce).b("clayHardenedStained");
/* 343 */       } else if (localaji == ajn.cn) { localObject = new aek(ajn.cn).b("stainedGlass");
/* 344 */       } else if (localaji == ajn.co) { localObject = new aek(ajn.co).b("stainedGlassPane");
/* 345 */       } else if (localaji == ajn.cg) { localObject = new aek(ajn.cg).b("woolCarpet");
/* 346 */       } else if (localaji == ajn.d) { localObject = new adl(ajn.d, ajn.d, akl.a).b("dirt");
/* 347 */       } else if (localaji == ajn.m) { localObject = new adl(ajn.m, ajn.m, anh.a).b("sand");
/* 348 */       } else if (localaji == ajn.r) { localObject = new adl(ajn.r, ajn.r, amm.M).b("log");
/* 349 */       } else if (localaji == ajn.s) { localObject = new adl(ajn.s, ajn.s, ami.M).b("log");
/* 350 */       } else if (localaji == ajn.f) { localObject = new adl(ajn.f, ajn.f, aom.a).b("wood");
/* 351 */       } else if (localaji == ajn.aU) { localObject = new adl(ajn.aU, ajn.aU, amb.a).b("monsterStoneEgg");
/* 352 */       } else if (localaji == ajn.aV) { localObject = new adl(ajn.aV, ajn.aV, anw.a).b("stonebricksmooth");
/* 353 */       } else if (localaji == ajn.A) { localObject = new adl(ajn.A, ajn.A, ani.a).b("sandStone");
/* 354 */       } else if (localaji == ajn.ca) { localObject = new adl(ajn.ca, ajn.ca, amx.a).b("quartzBlock");
/* 355 */       } else if (localaji == ajn.U) { localObject = new aeg(ajn.U, ajn.U, ajn.T, false).b("stoneSlab");
/* 356 */       } else if (localaji == ajn.T) { localObject = new aeg(ajn.T, ajn.U, ajn.T, true).b("stoneSlab");
/* 357 */       } else if (localaji == ajn.bx) { localObject = new aeg(ajn.bx, ajn.bx, ajn.bw, false).b("woodSlab");
/* 358 */       } else if (localaji == ajn.bw) { localObject = new aeg(ajn.bw, ajn.bx, ajn.bw, true).b("woodSlab");
/* 359 */       } else if (localaji == ajn.g) { localObject = new adl(ajn.g, ajn.g, anj.a).b("sapling");
/* 360 */       } else if (localaji == ajn.t) { localObject = new adg(ajn.t).b("leaves");
/* 361 */       } else if (localaji == ajn.u) { localObject = new adg(ajn.u).b("leaves");
/* 362 */       } else if (localaji == ajn.bd) { localObject = new abr(ajn.bd, false);
/* 363 */       } else if (localaji == ajn.H) { localObject = new abr(ajn.H, true).a(new String[] { "shrub", "grass", "fern" });
/* 364 */       } else if (localaji == ajn.N) { localObject = new adl(ajn.N, ajn.N, alc.b).b("flower");
/* 365 */       } else if (localaji == ajn.O) { localObject = new adl(ajn.O, ajn.O, alc.a).b("rose");
/* 366 */       } else if (localaji == ajn.aC) { localObject = new aec(ajn.aC, ajn.aC);
/* 367 */       } else if (localaji == ajn.bi) { localObject = new aej(ajn.bi);
/* 368 */       } else if (localaji == ajn.J) { localObject = new ado(ajn.J);
/* 369 */       } else if (localaji == ajn.F) { localObject = new ado(ajn.F);
/* 370 */       } else if (localaji == ajn.bK) { localObject = new adl(ajn.bK, ajn.bK, aoi.a).b("cobbleWall");
/* 371 */       } else if (localaji == ajn.bQ) { localObject = new aba(ajn.bQ).b("anvil");
/* 372 */       } else if (localaji == ajn.cm) { localObject = new aci(ajn.cm, ajn.cm, ako.a).b("doublePlant");
/* 373 */       } else { if (localHashSet.contains(localaji)) continue; localObject = new abh(localaji);
/*     */       }
/*     */       
/* 376 */       e.a(aji.b(localaji), str, localObject);
/*     */     }
/*     */   }
/*     */   
/* 380 */   protected int h = 64;
/*     */   
/*     */   private int b;
/*     */   
/*     */   protected boolean i;
/*     */   protected boolean j;
/*     */   private adb c;
/*     */   private String d;
/*     */   private String m;
/*     */   protected rf k;
/*     */   protected String l;
/*     */   
/*     */   public adb e(int paramInt)
/*     */   {
/* 394 */     this.h = paramInt;
/* 395 */     return this;
/*     */   }
/*     */   
/*     */   public int d() {
/* 399 */     return 1;
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt) {
/* 403 */     return this.k;
/*     */   }
/*     */   
/*     */   public final rf j(add paramadd) {
/* 407 */     return b_(paramadd.k());
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 411 */     return false;
/*     */   }
/*     */   
/*     */   public float a(add paramadd, aji paramaji) {
/* 415 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz) {
/* 419 */     return paramadd;
/*     */   }
/*     */   
/*     */   public add b(add paramadd, ahb paramahb, yz paramyz) {
/* 423 */     return paramadd;
/*     */   }
/*     */   
/*     */   public int m() {
/* 427 */     return this.h;
/*     */   }
/*     */   
/*     */   public int a(int paramInt) {
/* 431 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 435 */     return this.j;
/*     */   }
/*     */   
/*     */   protected adb a(boolean paramBoolean) {
/* 439 */     this.j = paramBoolean;
/* 440 */     return this;
/*     */   }
/*     */   
/*     */   public int o() {
/* 444 */     return this.b;
/*     */   }
/*     */   
/*     */   protected adb f(int paramInt) {
/* 448 */     this.b = paramInt;
/* 449 */     return this;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 453 */     return (this.b > 0) && (!this.j);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(add paramadd, sv paramsv1, sv paramsv2)
/*     */   {
/* 465 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(add paramadd, ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, sv paramsv)
/*     */   {
/* 480 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(aji paramaji) {
/* 484 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, sv paramsv) {
/* 488 */     return false;
/*     */   }
/*     */   
/*     */   public adb q() {
/* 492 */     this.i = true;
/* 493 */     return this;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 497 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 501 */     return false;
/*     */   }
/*     */   
/*     */   public adb c(String paramString)
/*     */   {
/* 506 */     this.m = paramString;
/* 507 */     return this;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public String k(add paramadd)
/*     */   {
/* 515 */     String str = a(paramadd);
/* 516 */     if (str == null) return "";
/* 517 */     return dd.a(str);
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/* 522 */     return "item." + this.m;
/*     */   }
/*     */   
/*     */   public String a(add paramadd) {
/* 526 */     return "item." + this.m;
/*     */   }
/*     */   
/*     */   public adb c(adb paramadb) {
/* 530 */     this.c = paramadb;
/* 531 */     return this;
/*     */   }
/*     */   
/*     */   public boolean l(add paramadd)
/*     */   {
/* 536 */     return true;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 540 */     return true;
/*     */   }
/*     */   
/*     */   public adb t() {
/* 544 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 548 */     return this.c != null;
/*     */   }
/*     */   
/*     */   public int a(add paramadd, int paramInt) {
/* 552 */     return 16777215;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(add paramadd, ahb paramahb, sa paramsa, int paramInt, boolean paramBoolean) {}
/*     */   
/*     */   public void d(add paramadd, ahb paramahb, yz paramyz) {}
/*     */   
/*     */   public boolean h()
/*     */   {
/* 562 */     return false;
/*     */   }
/*     */   
/*     */   public aei d(add paramadd) {
/* 566 */     return aei.a;
/*     */   }
/*     */   
/*     */   public int d_(add paramadd) {
/* 570 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(add paramadd, ahb paramahb, yz paramyz, int paramInt) {}
/*     */   
/*     */   protected adb e(String paramString)
/*     */   {
/* 577 */     this.d = paramString;
/* 578 */     return this;
/*     */   }
/*     */   
/*     */   public String i(add paramadd) {
/* 582 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean m(add paramadd) {
/* 586 */     return i(paramadd) != null;
/*     */   }
/*     */   
/*     */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean) {}
/*     */   
/*     */   public String n(add paramadd)
/*     */   {
/* 593 */     return ("" + dd.a(new StringBuilder().append(k(paramadd)).append(".name").toString())).trim();
/*     */   }
/*     */   
/*     */   public boolean e(add paramadd) {
/* 597 */     if (paramadd.y()) return true;
/* 598 */     return false;
/*     */   }
/*     */   
/*     */   public adq f(add paramadd) {
/* 602 */     if (paramadd.y()) return adq.c;
/* 603 */     return adq.a;
/*     */   }
/*     */   
/*     */   public boolean e_(add paramadd) {
/* 607 */     return (m() == 1) && (p());
/*     */   }
/*     */   
/*     */   protected azu a(ahb paramahb, yz paramyz, boolean paramBoolean) {
/* 611 */     float f1 = 1.0F;
/*     */     
/* 613 */     float f2 = paramyz.B + (paramyz.z - paramyz.B) * f1;
/* 614 */     float f3 = paramyz.A + (paramyz.y - paramyz.A) * f1;
/*     */     
/* 616 */     double d1 = paramyz.p + (paramyz.s - paramyz.p) * f1;
/* 617 */     double d2 = paramyz.q + (paramyz.t - paramyz.q) * f1 + 1.62D - paramyz.L;
/* 618 */     double d3 = paramyz.r + (paramyz.u - paramyz.r) * f1;
/*     */     
/* 620 */     azw localazw1 = azw.a(d1, d2, d3);
/*     */     
/* 622 */     float f4 = qh.b(-f3 * 0.017453292F - 3.1415927F);
/* 623 */     float f5 = qh.a(-f3 * 0.017453292F - 3.1415927F);
/* 624 */     float f6 = -qh.b(-f2 * 0.017453292F);
/* 625 */     float f7 = qh.a(-f2 * 0.017453292F);
/*     */     
/* 627 */     float f8 = f5 * f6;
/* 628 */     float f9 = f7;
/* 629 */     float f10 = f4 * f6;
/*     */     
/* 631 */     double d4 = 5.0D;
/* 632 */     azw localazw2 = localazw1.c(f8 * d4, f9 * d4, f10 * d4);
/*     */     
/* 634 */     return paramahb.a(localazw1, localazw2, paramBoolean, !paramBoolean, false);
/*     */   }
/*     */   
/*     */   public int c() {
/* 638 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 642 */     return false;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2) {
/* 646 */     return b_(paramInt1);
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList) {
/* 650 */     paramList.add(new add(paramadb, 1, 0));
/*     */   }
/*     */   
/*     */   public abt n_() {
/* 654 */     return this.a;
/*     */   }
/*     */   
/*     */   public adb a(abt paramabt) {
/* 658 */     this.a = paramabt;
/* 659 */     return this;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 663 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd1, add paramadd2) {
/* 667 */     return false;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {
/* 671 */     this.k = paramrg.a(w());
/*     */   }
/*     */   
/*     */   public Multimap k() {
/* 675 */     return HashMultimap.create();
/*     */   }
/*     */   
/*     */   protected adb f(String paramString) {
/* 679 */     this.l = paramString;
/* 680 */     return this;
/*     */   }
/*     */   
/*     */   protected String w() {
/* 684 */     if (this.l == null) return "MISSING_ICON_ITEM_" + e.b(this) + "_" + this.m;
/* 685 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */