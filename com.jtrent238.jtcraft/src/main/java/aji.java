/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class aji
/*      */ {
/*   28 */   public static final cw c = new cn("air");
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private abt a;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected String d;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static int b(aji paramaji)
/*      */   {
/*   51 */     return c.b(paramaji);
/*      */   }
/*      */   
/*      */   public static aji e(int paramInt) {
/*   55 */     return (aji)c.a(paramInt);
/*      */   }
/*      */   
/*      */   public static aji a(adb paramadb) {
/*   59 */     return e(adb.b(paramadb));
/*      */   }
/*      */   
/*      */   public static aji b(String paramString)
/*      */   {
/*   64 */     if (c.b(paramString)) {
/*   65 */       return (aji)c.a(paramString);
/*      */     }
/*      */     try
/*      */     {
/*   69 */       return (aji)c.a(Integer.parseInt(paramString));
/*      */     }
/*      */     catch (NumberFormatException localNumberFormatException) {}
/*      */     
/*   73 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean j()
/*      */   {
/*   87 */     return this.q;
/*      */   }
/*      */   
/*      */   public int k() {
/*   91 */     return this.r;
/*      */   }
/*      */   
/*      */   public boolean l() {
/*   95 */     return this.s;
/*      */   }
/*      */   
/*      */   public int m() {
/*   99 */     return this.t;
/*      */   }
/*      */   
/*      */   public boolean n() {
/*  103 */     return this.u;
/*      */   }
/*      */   
/*      */   public awt o() {
/*  107 */     return this.J;
/*      */   }
/*      */   
/*      */   public awv f(int paramInt) {
/*  111 */     return o().r();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  146 */   public static final ajm e = new ajm("stone", 1.0F, 1.0F);
/*  147 */   public static final ajm f = new ajm("wood", 1.0F, 1.0F);
/*  148 */   public static final ajm g = new ajm("gravel", 1.0F, 1.0F);
/*  149 */   public static final ajm h = new ajm("grass", 1.0F, 1.0F);
/*  150 */   public static final ajm i = new ajm("stone", 1.0F, 1.0F);
/*  151 */   public static final ajm j = new ajm("stone", 1.0F, 1.5F);
/*  152 */   public static final ajm k = new ajj("stone", 1.0F, 1.0F);
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  163 */   public static final ajm l = new ajm("cloth", 1.0F, 1.0F);
/*  164 */   public static final ajm m = new ajm("sand", 1.0F, 1.0F);
/*  165 */   public static final ajm n = new ajm("snow", 1.0F, 1.0F);
/*  166 */   public static final ajm o = new ajk("ladder", 1.0F, 1.0F);
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  172 */   public static final ajm p = new ajl("anvil", 0.3F, 1.0F);
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean q;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected int r;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean s;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected int t;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected boolean u;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected float v;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected float w;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static void p()
/*      */   {
/*  237 */     c.a(0, "air", new aja().c("air"));
/*  238 */     c.a(1, "stone", new anv().c(1.5F).b(10.0F).a(i).c("stone").d("stone"));
/*  239 */     c.a(2, "grass", new alh().c(0.6F).a(h).c("grass").d("grass"));
/*  240 */     c.a(3, "dirt", new akl().c(0.5F).a(g).c("dirt").d("dirt"));
/*  241 */     aji localaji1 = new aji(awt.e).c(2.0F).b(10.0F).a(i).c("stonebrick").a(abt.b).d("cobblestone");
/*  242 */     c.a(4, "cobblestone", localaji1);
/*  243 */     aji localaji2 = new aom().c(2.0F).b(5.0F).a(f).c("wood").d("planks");
/*  244 */     c.a(5, "planks", localaji2);
/*  245 */     c.a(6, "sapling", new anj().c(0.0F).a(h).c("sapling").d("sapling"));
/*  246 */     c.a(7, "bedrock", new aji(awt.e).s().b(6000000.0F).a(i).c("bedrock").H().a(abt.b).d("bedrock"));
/*  247 */     c.a(8, "flowing_water", new akr(awt.h).c(100.0F).g(3).c("water").H().d("water_flow"));
/*  248 */     c.a(9, "water", new ant(awt.h).c(100.0F).g(3).c("water").H().d("water_still"));
/*  249 */     c.a(10, "flowing_lava", new akr(awt.i).c(100.0F).a(1.0F).c("lava").H().d("lava_flow"));
/*  250 */     c.a(11, "lava", new ant(awt.i).c(100.0F).a(1.0F).c("lava").H().d("lava_still"));
/*  251 */     c.a(12, "sand", new anh().c(0.5F).a(m).c("sand").d("sand"));
/*  252 */     c.a(13, "gravel", new ali().c(0.6F).a(g).c("gravel").d("gravel"));
/*  253 */     c.a(14, "gold_ore", new amn().c(3.0F).b(5.0F).a(i).c("oreGold").d("gold_ore"));
/*  254 */     c.a(15, "iron_ore", new amn().c(3.0F).b(5.0F).a(i).c("oreIron").d("iron_ore"));
/*  255 */     c.a(16, "coal_ore", new amn().c(3.0F).b(5.0F).a(i).c("oreCoal").d("coal_ore"));
/*  256 */     c.a(17, "log", new amm().c("log").d("log"));
/*  257 */     c.a(18, "leaves", new aml().c("leaves").d("leaves"));
/*  258 */     c.a(19, "sponge", new anp().c(0.6F).a(h).c("sponge").d("sponge"));
/*  259 */     c.a(20, "glass", new alf(awt.s, false).c(0.3F).a(k).c("glass").d("glass"));
/*  260 */     c.a(21, "lapis_ore", new amn().c(3.0F).b(5.0F).a(i).c("oreLapis").d("lapis_ore"));
/*  261 */     c.a(22, "lapis_block", new alz(awv.H).c(3.0F).b(5.0F).a(i).c("blockLapis").a(abt.b).d("lapis_block"));
/*  262 */     c.a(23, "dispenser", new akm().c(3.5F).a(i).c("dispenser").d("dispenser"));
/*  263 */     aji localaji3 = new ani().a(i).c(0.8F).c("sandStone").d("sandstone");
/*  264 */     c.a(24, "sandstone", localaji3);
/*  265 */     c.a(25, "noteblock", new amj().c(0.8F).c("musicBlock").d("noteblock"));
/*  266 */     c.a(26, "bed", new ajh().c(0.2F).c("bed").H().d("bed"));
/*  267 */     c.a(27, "golden_rail", new amt().c(0.7F).a(j).c("goldenRail").d("rail_golden"));
/*  268 */     c.a(28, "detector_rail", new aki().c(0.7F).a(j).c("detectorRail").d("rail_detector"));
/*  269 */     c.a(29, "sticky_piston", new app(true).c("pistonStickyBase"));
/*  270 */     c.a(30, "web", new aok().g(1).c(4.0F).c("web").d("web"));
/*  271 */     c.a(31, "tallgrass", new anz().c(0.0F).a(h).c("tallgrass"));
/*  272 */     c.a(32, "deadbush", new akh().c(0.0F).a(h).c("deadbush").d("deadbush"));
/*  273 */     c.a(33, "piston", new app(false).c("pistonBase"));
/*  274 */     c.a(34, "piston_head", new apq());
/*  275 */     c.a(35, "wool", new aka(awt.n).c(0.8F).a(l).c("cloth").d("wool_colored"));
/*  276 */     c.a(36, "piston_extension", new apr());
/*  277 */     c.a(37, "yellow_flower", new alc(0).c(0.0F).a(h).c("flower1").d("flower_dandelion"));
/*  278 */     c.a(38, "red_flower", new alc(1).c(0.0F).a(h).c("flower2").d("flower_rose"));
/*  279 */     c.a(39, "brown_mushroom", new amc().c(0.0F).a(h).a(0.125F).c("mushroom").d("mushroom_brown"));
/*  280 */     c.a(40, "red_mushroom", new amc().c(0.0F).a(h).c("mushroom").d("mushroom_red"));
/*  281 */     c.a(41, "gold_block", new alz(awv.F).c(3.0F).b(10.0F).a(j).c("blockGold").d("gold_block"));
/*  282 */     c.a(42, "iron_block", new alz(awv.h).c(5.0F).b(10.0F).a(j).c("blockIron").d("iron_block"));
/*  283 */     c.a(43, "double_stone_slab", new any(true).c(2.0F).b(10.0F).a(i).c("stoneSlab"));
/*  284 */     c.a(44, "stone_slab", new any(false).c(2.0F).b(10.0F).a(i).c("stoneSlab"));
/*  285 */     aji localaji4 = new aji(awt.e).c(2.0F).b(10.0F).a(i).c("brick").a(abt.b).d("brick");
/*  286 */     c.a(45, "brick_block", localaji4);
/*  287 */     c.a(46, "tnt", new aob().c(0.0F).a(h).c("tnt").d("tnt"));
/*  288 */     c.a(47, "bookshelf", new ajp().c(1.5F).a(f).c("bookshelf").d("bookshelf"));
/*  289 */     c.a(48, "mossy_cobblestone", new aji(awt.e).c(2.0F).b(10.0F).a(i).c("stoneMoss").a(abt.b).d("cobblestone_mossy"));
/*  290 */     c.a(49, "obsidian", new amk().c(50.0F).b(2000.0F).a(i).c("obsidian").d("obsidian"));
/*  291 */     c.a(50, "torch", new aoc().c(0.0F).a(0.9375F).a(f).c("torch").d("torch_on"));
/*  292 */     c.a(51, "fire", new alb().c(0.0F).a(1.0F).a(f).c("fire").H().d("fire"));
/*  293 */     c.a(52, "mob_spawner", new ama().c(5.0F).a(j).c("mobSpawner").H().d("mob_spawner"));
/*  294 */     c.a(53, "oak_stairs", new ans(localaji2, 0).c("stairsWood"));
/*  295 */     c.a(54, "chest", new ajx(0).c(2.5F).a(f).c("chest"));
/*  296 */     c.a(55, "redstone_wire", new ana().c(0.0F).a(e).c("redstoneDust").H().d("redstone_dust"));
/*  297 */     c.a(56, "diamond_ore", new amn().c(3.0F).b(5.0F).a(i).c("oreDiamond").d("diamond_ore"));
/*  298 */     c.a(57, "diamond_block", new alz(awv.G).c(5.0F).b(10.0F).a(j).c("blockDiamond").d("diamond_block"));
/*  299 */     c.a(58, "crafting_table", new ake().c(2.5F).a(f).c("workbench").d("crafting_table"));
/*  300 */     c.a(59, "wheat", new akf().c("crops").d("wheat"));
/*  301 */     aji localaji5 = new aky().c(0.6F).a(g).c("farmland").d("farmland");
/*  302 */     c.a(60, "farmland", localaji5);
/*  303 */     c.a(61, "furnace", new ale(false).c(3.5F).a(i).c("furnace").a(abt.c));
/*  304 */     c.a(62, "lit_furnace", new ale(true).c(3.5F).a(i).a(0.875F).c("furnace"));
/*  305 */     c.a(63, "standing_sign", new ank(apm.class, true).c(1.0F).a(f).c("sign").H());
/*  306 */     c.a(64, "wooden_door", new akn(awt.d).c(3.0F).a(f).c("doorWood").H().d("door_wood"));
/*  307 */     c.a(65, "ladder", new als().c(0.4F).a(o).c("ladder").d("ladder"));
/*  308 */     c.a(66, "rail", new amy().c(0.7F).a(j).c("rail").d("rail_normal"));
/*  309 */     c.a(67, "stone_stairs", new ans(localaji1, 0).c("stairsStone"));
/*  310 */     c.a(68, "wall_sign", new ank(apm.class, false).c(1.0F).a(f).c("sign").H());
/*  311 */     c.a(69, "lever", new alv().c(0.5F).a(f).c("lever").d("lever"));
/*  312 */     c.a(70, "stone_pressure_plate", new amu("stone", awt.e, amv.b).c(0.5F).a(i).c("pressurePlate"));
/*  313 */     c.a(71, "iron_door", new akn(awt.f).c(5.0F).a(j).c("doorIron").H().d("door_iron"));
/*  314 */     c.a(72, "wooden_pressure_plate", new amu("planks_oak", awt.d, amv.a).c(0.5F).a(f).c("pressurePlate"));
/*  315 */     c.a(73, "redstone_ore", new amz(false).c(3.0F).b(5.0F).a(i).c("oreRedstone").a(abt.b).d("redstone_ore"));
/*  316 */     c.a(74, "lit_redstone_ore", new amz(true).a(0.625F).c(3.0F).b(5.0F).a(i).c("oreRedstone").d("redstone_ore"));
/*  317 */     c.a(75, "unlit_redstone_torch", new anc(false).c(0.0F).a(f).c("notGate").d("redstone_torch_off"));
/*  318 */     c.a(76, "redstone_torch", new anc(true).c(0.0F).a(0.5F).a(f).c("notGate").a(abt.d).d("redstone_torch_on"));
/*  319 */     c.a(77, "stone_button", new anx().c(0.5F).a(i).c("button"));
/*  320 */     c.a(78, "snow_layer", new ann().c(0.1F).a(n).c("snow").g(0).d("snow"));
/*  321 */     c.a(79, "ice", new alp().c(0.5F).g(3).a(k).c("ice").d("ice"));
/*  322 */     c.a(80, "snow", new anm().c(0.2F).a(n).c("snow").d("snow"));
/*  323 */     c.a(81, "cactus", new ajt().c(0.4F).a(l).c("cactus").d("cactus"));
/*  324 */     c.a(82, "clay", new ajy().c(0.6F).a(g).c("clay").d("clay"));
/*  325 */     c.a(83, "reeds", new ane().c(0.0F).a(h).c("reeds").H().d("reeds"));
/*  326 */     c.a(84, "jukebox", new alq().c(2.0F).b(10.0F).a(i).c("jukebox").d("jukebox"));
/*  327 */     c.a(85, "fence", new akz("planks_oak", awt.d).c(2.0F).b(5.0F).a(f).c("fence"));
/*  328 */     aji localaji6 = new amw(false).c(1.0F).a(f).c("pumpkin").d("pumpkin");
/*  329 */     c.a(86, "pumpkin", localaji6);
/*  330 */     c.a(87, "netherrack", new amg().c(0.4F).a(i).c("hellrock").d("netherrack"));
/*  331 */     c.a(88, "soul_sand", new ano().c(0.5F).a(m).c("hellsand").d("soul_sand"));
/*  332 */     c.a(89, "glowstone", new alg(awt.s).c(0.3F).a(k).a(1.0F).c("lightgem").d("glowstone"));
/*  333 */     c.a(90, "portal", new amp().c(-1.0F).a(k).a(0.75F).c("portal").d("portal"));
/*  334 */     c.a(91, "lit_pumpkin", new amw(true).c(1.0F).a(f).a(1.0F).c("litpumpkin").d("pumpkin"));
/*  335 */     c.a(92, "cake", new aju().c(0.5F).a(l).c("cake").H().d("cake"));
/*  336 */     c.a(93, "unpowered_repeater", new anf(false).c(0.0F).a(f).c("diode").H().d("repeater_off"));
/*  337 */     c.a(94, "powered_repeater", new anf(true).c(0.0F).a(0.625F).a(f).c("diode").H().d("repeater_on"));
/*  338 */     c.a(95, "stained_glass", new anq(awt.s).c(0.3F).a(k).c("stainedGlass").d("glass"));
/*  339 */     c.a(96, "trapdoor", new aoe(awt.d).c(3.0F).a(f).c("trapdoor").H().d("trapdoor"));
/*  340 */     c.a(97, "monster_egg", new amb().c(0.75F).c("monsterStoneEgg"));
/*  341 */     aji localaji7 = new anw().c(1.5F).b(10.0F).a(i).c("stonebricksmooth").d("stonebrick");
/*  342 */     c.a(98, "stonebrick", localaji7);
/*  343 */     c.a(99, "brown_mushroom_block", new alo(awt.d, 0).c(0.2F).a(f).c("mushroom").d("mushroom_block"));
/*  344 */     c.a(100, "red_mushroom_block", new alo(awt.d, 1).c(0.2F).a(f).c("mushroom").d("mushroom_block"));
/*  345 */     c.a(101, "iron_bars", new aoa("iron_bars", "iron_bars", awt.f, true).c(5.0F).b(10.0F).a(j).c("fenceIron"));
/*  346 */     c.a(102, "glass_pane", new aoa("glass", "glass_pane_top", awt.s, false).c(0.3F).a(k).c("thinGlass"));
/*  347 */     aji localaji8 = new aly().c(1.0F).a(f).c("melon").d("melon");
/*  348 */     c.a(103, "melon_block", localaji8);
/*  349 */     c.a(104, "pumpkin_stem", new anu(localaji6).c(0.0F).a(f).c("pumpkinStem").d("pumpkin_stem"));
/*  350 */     c.a(105, "melon_stem", new anu(localaji8).c(0.0F).a(f).c("pumpkinStem").d("melon_stem"));
/*  351 */     c.a(106, "vine", new aoh().c(0.2F).a(h).c("vine").d("vine"));
/*  352 */     c.a(107, "fence_gate", new ala().c(2.0F).b(5.0F).a(f).c("fenceGate"));
/*  353 */     c.a(108, "brick_stairs", new ans(localaji4, 0).c("stairsBrick"));
/*  354 */     c.a(109, "stone_brick_stairs", new ans(localaji7, 0).c("stairsStoneBrickSmooth"));
/*  355 */     c.a(110, "mycelium", new amd().c(0.6F).a(h).c("mycel").d("mycelium"));
/*  356 */     c.a(111, "waterlily", new aoj().c(0.0F).a(h).c("waterlily").d("waterlily"));
/*  357 */     aji localaji9 = new aji(awt.e).c(2.0F).b(10.0F).a(i).c("netherBrick").a(abt.b).d("nether_brick");
/*  358 */     c.a(112, "nether_brick", localaji9);
/*  359 */     c.a(113, "nether_brick_fence", new akz("nether_brick", awt.e).c(2.0F).b(10.0F).a(i).c("netherFence"));
/*  360 */     c.a(114, "nether_brick_stairs", new ans(localaji9, 0).c("stairsNetherBrick"));
/*  361 */     c.a(115, "nether_wart", new amf().c("netherStalk").d("nether_wart"));
/*  362 */     c.a(116, "enchanting_table", new aks().c(5.0F).b(2000.0F).c("enchantmentTable").d("enchanting_table"));
/*  363 */     c.a(117, "brewing_stand", new ajq().c(0.5F).a(0.125F).c("brewingStand").d("brewing_stand"));
/*  364 */     c.a(118, "cauldron", new ajw().c(2.0F).c("cauldron").d("cauldron"));
/*  365 */     c.a(119, "end_portal", new akt(awt.E).c(-1.0F).b(6000000.0F));
/*  366 */     c.a(120, "end_portal_frame", new aku().a(k).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(abt.c).d("endframe"));
/*  367 */     c.a(121, "end_stone", new aji(awt.e).c(3.0F).b(15.0F).a(i).c("whiteStone").a(abt.b).d("end_stone"));
/*  368 */     c.a(122, "dragon_egg", new akp().c(3.0F).b(15.0F).a(i).a(0.125F).c("dragonEgg").d("dragon_egg"));
/*  369 */     c.a(123, "redstone_lamp", new anb(false).c(0.3F).a(k).c("redstoneLight").a(abt.d).d("redstone_lamp_off"));
/*  370 */     c.a(124, "lit_redstone_lamp", new anb(true).c(0.3F).a(k).c("redstoneLight").d("redstone_lamp_on"));
/*  371 */     c.a(125, "double_wooden_slab", new aoo(true).c(2.0F).b(5.0F).a(f).c("woodSlab"));
/*  372 */     c.a(126, "wooden_slab", new aoo(false).c(2.0F).b(5.0F).a(f).c("woodSlab"));
/*  373 */     c.a(127, "cocoa", new ajz().c(0.2F).b(5.0F).a(f).c("cocoa").d("cocoa"));
/*  374 */     c.a(128, "sandstone_stairs", new ans(localaji3, 0).c("stairsSandStone"));
/*  375 */     c.a(129, "emerald_ore", new amn().c(3.0F).b(5.0F).a(i).c("oreEmerald").d("emerald_ore"));
/*  376 */     c.a(130, "ender_chest", new akv().c(22.5F).b(1000.0F).a(i).c("enderChest").a(0.5F));
/*  377 */     c.a(131, "tripwire_hook", new aog().c("tripWireSource").d("trip_wire_source"));
/*  378 */     c.a(132, "tripwire", new aof().c("tripWire").d("trip_wire"));
/*  379 */     c.a(133, "emerald_block", new alz(awv.I).c(5.0F).b(10.0F).a(j).c("blockEmerald").d("emerald_block"));
/*  380 */     c.a(134, "spruce_stairs", new ans(localaji2, 1).c("stairsWoodSpruce"));
/*  381 */     c.a(135, "birch_stairs", new ans(localaji2, 2).c("stairsWoodBirch"));
/*  382 */     c.a(136, "jungle_stairs", new ans(localaji2, 3).c("stairsWoodJungle"));
/*  383 */     c.a(137, "command_block", new akb().s().b(6000000.0F).c("commandBlock").d("command_block"));
/*  384 */     c.a(138, "beacon", new ajg().c("beacon").a(1.0F).d("beacon"));
/*  385 */     c.a(139, "cobblestone_wall", new aoi(localaji1).c("cobbleWall"));
/*  386 */     c.a(140, "flower_pot", new ald().c(0.0F).a(e).c("flowerPot").d("flower_pot"));
/*  387 */     c.a(141, "carrots", new ajv().c("carrots").d("carrots"));
/*  388 */     c.a(142, "potatoes", new amr().c("potatoes").d("potatoes"));
/*  389 */     c.a(143, "wooden_button", new aon().c(0.5F).a(f).c("button"));
/*  390 */     c.a(144, "skull", new anl().c(1.0F).a(i).c("skull").d("skull"));
/*  391 */     c.a(145, "anvil", new ajb().c(5.0F).a(p).b(2000.0F).c("anvil"));
/*  392 */     c.a(146, "trapped_chest", new ajx(1).c(2.5F).a(f).c("chestTrap"));
/*  393 */     c.a(147, "light_weighted_pressure_plate", new aol("gold_block", awt.f, 15).c(0.5F).a(f).c("weightedPlate_light"));
/*  394 */     c.a(148, "heavy_weighted_pressure_plate", new aol("iron_block", awt.f, 150).c(0.5F).a(f).c("weightedPlate_heavy"));
/*  395 */     c.a(149, "unpowered_comparator", new akc(false).c(0.0F).a(f).c("comparator").H().d("comparator_off"));
/*  396 */     c.a(150, "powered_comparator", new akc(true).c(0.0F).a(0.625F).a(f).c("comparator").H().d("comparator_on"));
/*  397 */     c.a(151, "daylight_detector", new akg().c(0.2F).a(f).c("daylightDetector").d("daylight_detector"));
/*  398 */     c.a(152, "redstone_block", new ams(awv.f).c(5.0F).b(10.0F).a(j).c("blockRedstone").d("redstone_block"));
/*  399 */     c.a(153, "quartz_ore", new amn().c(3.0F).b(5.0F).a(i).c("netherquartz").d("quartz_ore"));
/*  400 */     c.a(154, "hopper", new aln().c(3.0F).b(8.0F).a(f).c("hopper").d("hopper"));
/*  401 */     aji localaji10 = new amx().a(i).c(0.8F).c("quartzBlock").d("quartz_block");
/*  402 */     c.a(155, "quartz_block", localaji10);
/*  403 */     c.a(156, "quartz_stairs", new ans(localaji10, 0).c("stairsQuartz"));
/*  404 */     c.a(157, "activator_rail", new amt().c(0.7F).a(j).c("activatorRail").d("rail_activator"));
/*  405 */     c.a(158, "dropper", new akq().c(3.5F).a(i).c("dropper").d("dropper"));
/*  406 */     c.a(159, "stained_hardened_clay", new aka(awt.e).c(1.25F).b(7.0F).a(i).c("clayHardenedStained").d("hardened_clay_stained"));
/*  407 */     c.a(160, "stained_glass_pane", new anr().c(0.3F).a(k).c("thinStainedGlass").d("glass"));
/*  408 */     c.a(161, "leaves2", new amh().c("leaves").d("leaves"));
/*  409 */     c.a(162, "log2", new ami().c("log").d("log"));
/*  410 */     c.a(163, "acacia_stairs", new ans(localaji2, 4).c("stairsWoodAcacia"));
/*  411 */     c.a(164, "dark_oak_stairs", new ans(localaji2, 5).c("stairsWoodDarkOak"));
/*      */     
/*      */ 
/*      */ 
/*  415 */     c.a(170, "hay_block", new alm().c(0.5F).a(h).c("hayBlock").a(abt.b).d("hay_block"));
/*  416 */     c.a(171, "carpet", new aop().c(0.1F).a(l).c("woolCarpet").g(0));
/*  417 */     c.a(172, "hardened_clay", new all().c(1.25F).b(7.0F).a(i).c("clayHardened").d("hardened_clay"));
/*  418 */     c.a(173, "coal_block", new aji(awt.e).c(5.0F).b(10.0F).a(i).c("blockCoal").a(abt.b).d("coal_block"));
/*  419 */     c.a(174, "packed_ice", new amo().c(0.5F).a(k).c("icePacked").d("ice_packed"));
/*  420 */     c.a(175, "double_plant", new ako());
/*      */     
/*      */ 
/*      */ 
/*  424 */     for (aji localaji11 : c) {
/*  425 */       if (localaji11.J == awt.a) {
/*  426 */         localaji11.u = false;
/*      */ 
/*      */       }
/*      */       else
/*      */       {
/*  431 */         boolean bool1 = false;
/*  432 */         int i1 = localaji11.b() == 10 ? 1 : 0;
/*  433 */         boolean bool2 = localaji11 instanceof alj;
/*  434 */         int i2 = localaji11 == localaji5 ? 1 : 0;
/*  435 */         boolean bool3 = localaji11.s;
/*  436 */         int i3 = localaji11.r == 0 ? 1 : 0;
/*  437 */         if ((i1 != 0) || (bool2) || (i2 != 0) || (bool3) || (i3 != 0)) {
/*  438 */           bool1 = true;
/*      */         }
/*      */         
/*  441 */         localaji11.u = bool1;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*  447 */   protected boolean x = true;
/*  448 */   protected boolean y = true;
/*      */   protected boolean z;
/*      */   protected boolean A;
/*      */   protected double B;
/*      */   protected double C;
/*      */   protected double D;
/*  454 */   protected double E; protected double F; protected double G; public ajm H = e;
/*      */   
/*  456 */   public float I = 1.0F;
/*      */   protected final awt J;
/*  458 */   public float K = 0.6F;
/*      */   private String b;
/*      */   protected rf L;
/*      */   
/*      */   protected aji(awt paramawt)
/*      */   {
/*  464 */     this.J = paramawt;
/*  465 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  466 */     this.q = c();
/*  467 */     this.r = (c() ? 255 : 0);
/*  468 */     this.s = (!paramawt.b());
/*      */   }
/*      */   
/*      */   protected aji a(ajm paramajm) {
/*  472 */     this.H = paramajm;
/*  473 */     return this;
/*      */   }
/*      */   
/*      */   protected aji g(int paramInt) {
/*  477 */     this.r = paramInt;
/*  478 */     return this;
/*      */   }
/*      */   
/*      */   protected aji a(float paramFloat) {
/*  482 */     this.t = ((int)(15.0F * paramFloat));
/*  483 */     return this;
/*      */   }
/*      */   
/*      */   protected aji b(float paramFloat) {
/*  487 */     this.w = (paramFloat * 3.0F);
/*  488 */     return this;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean q()
/*      */   {
/*  496 */     return (this.J.c()) && (d());
/*      */   }
/*      */   
/*      */   public boolean r() {
/*  500 */     return (this.J.k()) && (d()) && (!f());
/*      */   }
/*      */   
/*      */   public boolean d() {
/*  504 */     return true;
/*      */   }
/*      */   
/*      */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  508 */     return !this.J.c();
/*      */   }
/*      */   
/*      */   public int b() {
/*  512 */     return 0;
/*      */   }
/*      */   
/*      */   protected aji c(float paramFloat) {
/*  516 */     this.v = paramFloat;
/*  517 */     if (this.w < paramFloat * 5.0F) this.w = (paramFloat * 5.0F);
/*  518 */     return this;
/*      */   }
/*      */   
/*      */   protected aji s() {
/*  522 */     c(-1.0F);
/*  523 */     return this;
/*      */   }
/*      */   
/*      */   public float f(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  527 */     return this.v;
/*      */   }
/*      */   
/*      */   protected aji a(boolean paramBoolean) {
/*  531 */     this.z = paramBoolean;
/*  532 */     return this;
/*      */   }
/*      */   
/*      */   public boolean t() {
/*  536 */     return this.z;
/*      */   }
/*      */   
/*      */   public boolean u() {
/*  540 */     return this.A;
/*      */   }
/*      */   
/*      */   protected final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  544 */     this.B = paramFloat1;
/*  545 */     this.C = paramFloat2;
/*  546 */     this.D = paramFloat3;
/*  547 */     this.E = paramFloat4;
/*  548 */     this.F = paramFloat5;
/*  549 */     this.G = paramFloat6;
/*      */   }
/*      */   
/*      */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  553 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/*  554 */     int i1 = paramahl.c(paramInt1, paramInt2, paramInt3, localaji.m());
/*      */     
/*      */ 
/*  557 */     if ((i1 == 0) && ((localaji instanceof alj))) {
/*  558 */       paramInt2--;
/*  559 */       localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/*  560 */       return paramahl.c(paramInt1, paramInt2, paramInt3, localaji.m());
/*      */     }
/*  562 */     return i1;
/*      */   }
/*      */   
/*      */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  566 */     if ((paramInt4 == 0) && (this.C > 0.0D)) return true;
/*  567 */     if ((paramInt4 == 1) && (this.F < 1.0D)) return true;
/*  568 */     if ((paramInt4 == 2) && (this.D > 0.0D)) return true;
/*  569 */     if ((paramInt4 == 3) && (this.G < 1.0D)) return true;
/*  570 */     if ((paramInt4 == 4) && (this.B > 0.0D)) return true;
/*  571 */     if ((paramInt4 == 5) && (this.E < 1.0D)) return true;
/*  572 */     return !paramahl.a(paramInt1, paramInt2, paramInt3).c();
/*      */   }
/*      */   
/*      */   public boolean d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  577 */     return paramahl.a(paramInt1, paramInt2, paramInt3).o().a();
/*      */   }
/*      */   
/*      */   public rf e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  581 */     return a(paramInt4, paramahl.e(paramInt1, paramInt2, paramInt3));
/*      */   }
/*      */   
/*      */   public rf a(int paramInt1, int paramInt2) {
/*  585 */     return this.L;
/*      */   }
/*      */   
/*      */   public final rf h(int paramInt) {
/*  589 */     return a(paramInt, 0);
/*      */   }
/*      */   
/*      */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  593 */     return azt.a(paramInt1 + this.B, paramInt2 + this.C, paramInt3 + this.D, paramInt1 + this.E, paramInt2 + this.F, paramInt3 + this.G);
/*      */   }
/*      */   
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa) {
/*  597 */     azt localazt = a(paramahb, paramInt1, paramInt2, paramInt3);
/*  598 */     if ((localazt != null) && (paramazt.b(localazt))) paramList.add(localazt);
/*      */   }
/*      */   
/*      */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  602 */     return azt.a(paramInt1 + this.B, paramInt2 + this.C, paramInt3 + this.D, paramInt1 + this.E, paramInt2 + this.F, paramInt3 + this.G);
/*      */   }
/*      */   
/*      */   public boolean c() {
/*  606 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt, boolean paramBoolean) {
/*  610 */     return v();
/*      */   }
/*      */   
/*      */   public boolean v() {
/*  614 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*      */   
/*      */ 
/*      */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*      */   
/*      */ 
/*      */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*      */   
/*      */ 
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji) {}
/*      */   
/*      */ 
/*      */   public int a(ahb paramahb)
/*      */   {
/*  633 */     return 10;
/*      */   }
/*      */   
/*      */ 
/*      */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {}
/*      */   
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {}
/*      */   
/*      */   public int a(Random paramRandom)
/*      */   {
/*  643 */     return 1;
/*      */   }
/*      */   
/*      */   public adb a(int paramInt1, Random paramRandom, int paramInt2) {
/*  647 */     return adb.a(this);
/*      */   }
/*      */   
/*      */   public float a(yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  651 */     float f1 = f(paramahb, paramInt1, paramInt2, paramInt3);
/*  652 */     if (f1 < 0.0F) return 0.0F;
/*  653 */     if (!paramyz.a(this)) {
/*  654 */       return paramyz.a(this, false) / f1 / 100.0F;
/*      */     }
/*  656 */     return paramyz.a(this, true) / f1 / 30.0F;
/*      */   }
/*      */   
/*      */   public final void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  660 */     a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, 1.0F, paramInt5);
/*      */   }
/*      */   
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
/*  664 */     if (paramahb.E) return;
/*  665 */     int i1 = a(paramInt5, paramahb.s);
/*  666 */     for (int i2 = 0; i2 < i1; i2++)
/*  667 */       if (paramahb.s.nextFloat() <= paramFloat) {
/*  668 */         adb localadb = a(paramInt4, paramahb.s, paramInt5);
/*  669 */         if (localadb != null)
/*      */         {
/*  671 */           a(paramahb, paramInt1, paramInt2, paramInt3, new add(localadb, 1, a(paramInt4))); }
/*      */       }
/*      */   }
/*      */   
/*      */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, add paramadd) {
/*  676 */     if ((paramahb.E) || (!paramahb.O().b("doTileDrops"))) { return;
/*      */     }
/*  678 */     float f1 = 0.7F;
/*  679 */     double d1 = paramahb.s.nextFloat() * f1 + (1.0F - f1) * 0.5D;
/*  680 */     double d2 = paramahb.s.nextFloat() * f1 + (1.0F - f1) * 0.5D;
/*  681 */     double d3 = paramahb.s.nextFloat() * f1 + (1.0F - f1) * 0.5D;
/*  682 */     xk localxk = new xk(paramahb, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, paramadd);
/*  683 */     localxk.b = 10;
/*  684 */     paramahb.d(localxk);
/*      */   }
/*      */   
/*      */   protected void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  688 */     if (!paramahb.E) {
/*  689 */       while (paramInt4 > 0) {
/*  690 */         int i1 = sq.a(paramInt4);
/*  691 */         paramInt4 -= i1;
/*  692 */         paramahb.d(new sq(paramahb, paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, i1));
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int a(int paramInt)
/*      */   {
/*  704 */     return 0;
/*      */   }
/*      */   
/*      */   public float a(sa paramsa) {
/*  708 */     return this.w / 5.0F;
/*      */   }
/*      */   
/*      */   public azu a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azw paramazw1, azw paramazw2) {
/*  712 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*      */     
/*  714 */     paramazw1 = paramazw1.c(-paramInt1, -paramInt2, -paramInt3);
/*  715 */     paramazw2 = paramazw2.c(-paramInt1, -paramInt2, -paramInt3);
/*      */     
/*  717 */     azw localazw1 = paramazw1.b(paramazw2, this.B);
/*  718 */     azw localazw2 = paramazw1.b(paramazw2, this.E);
/*      */     
/*  720 */     azw localazw3 = paramazw1.c(paramazw2, this.C);
/*  721 */     azw localazw4 = paramazw1.c(paramazw2, this.F);
/*      */     
/*  723 */     azw localazw5 = paramazw1.d(paramazw2, this.D);
/*  724 */     azw localazw6 = paramazw1.d(paramazw2, this.G);
/*      */     
/*  726 */     if (!a(localazw1)) localazw1 = null;
/*  727 */     if (!a(localazw2)) localazw2 = null;
/*  728 */     if (!b(localazw3)) localazw3 = null;
/*  729 */     if (!b(localazw4)) localazw4 = null;
/*  730 */     if (!c(localazw5)) localazw5 = null;
/*  731 */     if (!c(localazw6)) { localazw6 = null;
/*      */     }
/*  733 */     azw localazw7 = null;
/*      */     
/*  735 */     if ((localazw1 != null) && ((localazw7 == null) || (paramazw1.e(localazw1) < paramazw1.e(localazw7)))) localazw7 = localazw1;
/*  736 */     if ((localazw2 != null) && ((localazw7 == null) || (paramazw1.e(localazw2) < paramazw1.e(localazw7)))) localazw7 = localazw2;
/*  737 */     if ((localazw3 != null) && ((localazw7 == null) || (paramazw1.e(localazw3) < paramazw1.e(localazw7)))) localazw7 = localazw3;
/*  738 */     if ((localazw4 != null) && ((localazw7 == null) || (paramazw1.e(localazw4) < paramazw1.e(localazw7)))) localazw7 = localazw4;
/*  739 */     if ((localazw5 != null) && ((localazw7 == null) || (paramazw1.e(localazw5) < paramazw1.e(localazw7)))) localazw7 = localazw5;
/*  740 */     if ((localazw6 != null) && ((localazw7 == null) || (paramazw1.e(localazw6) < paramazw1.e(localazw7)))) { localazw7 = localazw6;
/*      */     }
/*  742 */     if (localazw7 == null) { return null;
/*      */     }
/*  744 */     int i1 = -1;
/*      */     
/*  746 */     if (localazw7 == localazw1) i1 = 4;
/*  747 */     if (localazw7 == localazw2) i1 = 5;
/*  748 */     if (localazw7 == localazw3) i1 = 0;
/*  749 */     if (localazw7 == localazw4) i1 = 1;
/*  750 */     if (localazw7 == localazw5) i1 = 2;
/*  751 */     if (localazw7 == localazw6) { i1 = 3;
/*      */     }
/*  753 */     return new azu(paramInt1, paramInt2, paramInt3, i1, localazw7.c(paramInt1, paramInt2, paramInt3));
/*      */   }
/*      */   
/*      */   private boolean a(azw paramazw) {
/*  757 */     if (paramazw == null) return false;
/*  758 */     return (paramazw.b >= this.C) && (paramazw.b <= this.F) && (paramazw.c >= this.D) && (paramazw.c <= this.G);
/*      */   }
/*      */   
/*      */   private boolean b(azw paramazw) {
/*  762 */     if (paramazw == null) return false;
/*  763 */     return (paramazw.a >= this.B) && (paramazw.a <= this.E) && (paramazw.c >= this.D) && (paramazw.c <= this.G);
/*      */   }
/*      */   
/*      */   private boolean c(azw paramazw) {
/*  767 */     if (paramazw == null) return false;
/*  768 */     return (paramazw.a >= this.B) && (paramazw.a <= this.E) && (paramazw.b >= this.C) && (paramazw.b <= this.F);
/*      */   }
/*      */   
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, agw paramagw) {}
/*      */   
/*      */   public int w()
/*      */   {
/*  775 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, add paramadd) {
/*  779 */     return d(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  783 */     return c(paramahb, paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  787 */     return paramahb.a(paramInt1, paramInt2, paramInt3).J.j();
/*      */   }
/*      */   
/*      */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
/*  791 */     return false;
/*      */   }
/*      */   
/*      */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa) {}
/*      */   
/*      */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*      */   {
/*  798 */     return paramInt5;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {}
/*      */   
/*      */ 
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa, azw paramazw) {}
/*      */   
/*      */ 
/*      */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {}
/*      */   
/*      */ 
/*      */   public final double x()
/*      */   {
/*  814 */     return this.B;
/*      */   }
/*      */   
/*      */   public final double y() {
/*  818 */     return this.E;
/*      */   }
/*      */   
/*      */   public final double z() {
/*  822 */     return this.C;
/*      */   }
/*      */   
/*      */   public final double A() {
/*  826 */     return this.F;
/*      */   }
/*      */   
/*      */   public final double B() {
/*  830 */     return this.D;
/*      */   }
/*      */   
/*      */   public final double C() {
/*  834 */     return this.G;
/*      */   }
/*      */   
/*      */   public int D() {
/*  838 */     return 16777215;
/*      */   }
/*      */   
/*      */   public int i(int paramInt) {
/*  842 */     return 16777215;
/*      */   }
/*      */   
/*      */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  846 */     return 16777215;
/*      */   }
/*      */   
/*      */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  850 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean f() {
/*  854 */     return false;
/*      */   }
/*      */   
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa) {}
/*      */   
/*      */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  861 */     return 0;
/*      */   }
/*      */   
/*      */   public void g() {}
/*      */   
/*      */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  868 */     paramyz.a(pp.C[b(this)], 1);
/*  869 */     paramyz.a(0.025F);
/*      */     
/*  871 */     if ((E()) && (afv.e(paramyz))) {
/*  872 */       add localadd = j(paramInt4);
/*  873 */       if (localadd != null) {
/*  874 */         a(paramahb, paramInt1, paramInt2, paramInt3, localadd);
/*      */       }
/*      */     } else {
/*  877 */       int i1 = afv.f(paramyz);
/*  878 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, i1);
/*      */     }
/*      */   }
/*      */   
/*      */   protected boolean E() {
/*  883 */     return (d()) && (!this.A);
/*      */   }
/*      */   
/*      */   protected add j(int paramInt) {
/*  887 */     int i1 = 0;
/*  888 */     adb localadb = adb.a(this);
/*  889 */     if ((localadb != null) && (localadb.n())) {
/*  890 */       i1 = paramInt;
/*      */     }
/*  892 */     return new add(localadb, 1, i1);
/*      */   }
/*      */   
/*      */   public int a(int paramInt, Random paramRandom) {
/*  896 */     return a(paramRandom);
/*      */   }
/*      */   
/*      */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  900 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd) {}
/*      */   
/*      */ 
/*      */   public void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*      */   
/*      */   public aji c(String paramString)
/*      */   {
/*  911 */     this.b = paramString;
/*  912 */     return this;
/*      */   }
/*      */   
/*      */   public String F() {
/*  916 */     return dd.a(a() + ".name");
/*      */   }
/*      */   
/*      */   public String a()
/*      */   {
/*  921 */     return "tile." + this.b;
/*      */   }
/*      */   
/*      */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  925 */     return false;
/*      */   }
/*      */   
/*      */   public boolean G() {
/*  929 */     return this.y;
/*      */   }
/*      */   
/*      */   protected aji H() {
/*  933 */     this.y = false;
/*  934 */     return this;
/*      */   }
/*      */   
/*      */   public int h() {
/*  938 */     return this.J.m();
/*      */   }
/*      */   
/*      */   public float I() {
/*  942 */     return q() ? 0.2F : 1.0F;
/*      */   }
/*      */   
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa, float paramFloat) {}
/*      */   
/*      */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  949 */     return adb.a(this);
/*      */   }
/*      */   
/*      */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  953 */     return a(paramahb.e(paramInt1, paramInt2, paramInt3));
/*      */   }
/*      */   
/*      */   public void a(adb paramadb, abt paramabt, List paramList) {
/*  957 */     paramList.add(new add(paramadb, 1, 0));
/*      */   }
/*      */   
/*      */   public abt J() {
/*  961 */     return this.a;
/*      */   }
/*      */   
/*      */   public aji a(abt paramabt) {
/*  965 */     this.a = paramabt;
/*  966 */     return this;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz) {}
/*      */   
/*      */ 
/*      */   public void f(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*      */   
/*      */ 
/*      */   public void l(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {}
/*      */   
/*      */ 
/*      */   public boolean K()
/*      */   {
/*  982 */     return false;
/*      */   }
/*      */   
/*      */   public boolean L() {
/*  986 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(agw paramagw) {
/*  990 */     return true;
/*      */   }
/*      */   
/*      */   public boolean c(aji paramaji) {
/*  994 */     return this == paramaji;
/*      */   }
/*      */   
/*      */   public static boolean a(aji paramaji1, aji paramaji2) {
/*  998 */     if ((paramaji1 == null) || (paramaji2 == null)) {
/*  999 */       return false;
/*      */     }
/* 1001 */     if (paramaji1 == paramaji2) {
/* 1002 */       return true;
/*      */     }
/* 1004 */     return paramaji1.c(paramaji2);
/*      */   }
/*      */   
/*      */   public boolean M() {
/* 1008 */     return false;
/*      */   }
/*      */   
/*      */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1012 */     return 0;
/*      */   }
/*      */   
/*      */   protected aji d(String paramString) {
/* 1016 */     this.d = paramString;
/* 1017 */     return this;
/*      */   }
/*      */   
/*      */   protected String N() {
/* 1021 */     return this.d == null ? "MISSING_ICON_BLOCK_" + b(this) + "_" + this.b : this.d;
/*      */   }
/*      */   
/*      */   public rf b(int paramInt1, int paramInt2) {
/* 1025 */     return a(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public void a(rg paramrg) {
/* 1029 */     this.L = paramrg.a(N());
/*      */   }
/*      */   
/*      */   public String O() {
/* 1033 */     return null;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */