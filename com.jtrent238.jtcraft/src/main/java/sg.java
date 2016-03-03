/*     */ import java.lang.reflect.Constructor;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class sg
/*     */ {
/*  20 */   private static final Logger b = ;
/*  21 */   private static Map c = new HashMap();
/*  22 */   private static Map d = new HashMap();
/*  23 */   private static Map e = new HashMap();
/*  24 */   private static Map f = new HashMap();
/*  25 */   private static Map g = new HashMap();
/*     */   
/*  27 */   public static HashMap a = new LinkedHashMap();
/*     */   
/*     */   private static void a(Class paramClass, String paramString, int paramInt) {
/*  30 */     if (c.containsKey(paramString)) throw new IllegalArgumentException("ID is already registered: " + paramString);
/*  31 */     if (e.containsKey(Integer.valueOf(paramInt))) throw new IllegalArgumentException("ID is already registered: " + paramInt);
/*  32 */     c.put(paramString, paramClass);
/*  33 */     d.put(paramClass, paramString);
/*  34 */     e.put(Integer.valueOf(paramInt), paramClass);
/*  35 */     f.put(paramClass, Integer.valueOf(paramInt));
/*  36 */     g.put(paramString, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   private static void a(Class paramClass, String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     a(paramClass, paramString, paramInt1);
/*     */     
/*  42 */     a.put(Integer.valueOf(paramInt1), new sh(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   static {
/*  46 */     a(xk.class, "Item", 1);
/*  47 */     a(sq.class, "XPOrb", 2);
/*     */     
/*  49 */     a(su.class, "LeashKnot", 8);
/*  50 */     a(tb.class, "Painting", 9);
/*  51 */     a(zc.class, "Arrow", 10);
/*  52 */     a(zj.class, "Snowball", 11);
/*  53 */     a(zg.class, "Fireball", 12);
/*  54 */     a(zi.class, "SmallFireball", 13);
/*  55 */     a(zm.class, "ThrownEnderpearl", 14);
/*  56 */     a(zd.class, "EyeOfEnderSignal", 15);
/*  57 */     a(zo.class, "ThrownPotion", 16);
/*  58 */     a(zn.class, "ThrownExpBottle", 17);
/*  59 */     a(st.class, "ItemFrame", 18);
/*  60 */     a(zp.class, "WitherSkull", 19);
/*     */     
/*  62 */     a(xw.class, "PrimedTnt", 20);
/*  63 */     a(xj.class, "FallingSand", 21);
/*     */     
/*  65 */     a(zf.class, "FireworksRocketEntity", 22);
/*     */     
/*  67 */     a(xi.class, "Boat", 41);
/*  68 */     a(xs.class, "MinecartRideable", 42);
/*  69 */     a(xm.class, "MinecartChest", 43);
/*  70 */     a(xq.class, "MinecartFurnace", 44);
/*  71 */     a(xv.class, "MinecartTNT", 45);
/*  72 */     a(xr.class, "MinecartHopper", 46);
/*  73 */     a(xt.class, "MinecartSpawner", 47);
/*  74 */     a(xn.class, "MinecartCommandBlock", 40);
/*     */     
/*  76 */     a(sw.class, "Mob", 48);
/*  77 */     a(yg.class, "Monster", 49);
/*     */     
/*  79 */     a(xz.class, "Creeper", 50, 894731, 0);
/*  80 */     a(yl.class, "Skeleton", 51, 12698049, 4802889);
/*  81 */     a(yn.class, "Spider", 52, 3419431, 11013646);
/*  82 */     a(ye.class, "Giant", 53);
/*  83 */     a(yq.class, "Zombie", 54, 44975, 7969893);
/*  84 */     a(ym.class, "Slime", 55, 5349438, 8306542);
/*  85 */     a(yd.class, "Ghast", 56, 16382457, 12369084);
/*  86 */     a(yh.class, "PigZombie", 57, 15373203, 5009705);
/*  87 */     a(ya.class, "Enderman", 58, 1447446, 0);
/*  88 */     a(xy.class, "CaveSpider", 59, 803406, 11013646);
/*  89 */     a(yk.class, "Silverfish", 60, 7237230, 3158064);
/*  90 */     a(xx.class, "Blaze", 61, 16167425, 16775294);
/*  91 */     a(yf.class, "LavaSlime", 62, 3407872, 16579584);
/*  92 */     a(xa.class, "EnderDragon", 63);
/*  93 */     a(xc.class, "WitherBoss", 64);
/*  94 */     a(we.class, "Bat", 65, 4996656, 986895);
/*  95 */     a(yp.class, "Witch", 66, 3407872, 5349438);
/*     */     
/*  97 */     a(wo.class, "Pig", 90, 15771042, 14377823);
/*  98 */     a(wp.class, "Sheep", 91, 15198183, 16758197);
/*  99 */     a(wh.class, "Cow", 92, 4470310, 10592673);
/* 100 */     a(wg.class, "Chicken", 93, 10592673, 16711680);
/* 101 */     a(ws.class, "Squid", 94, 2243405, 7375001);
/* 102 */     a(wv.class, "Wolf", 95, 14144467, 13545366);
/* 103 */     a(wm.class, "MushroomCow", 96, 10489616, 12040119);
/* 104 */     a(wr.class, "SnowMan", 97);
/* 105 */     a(wn.class, "Ozelot", 98, 15720061, 5653556);
/* 106 */     a(wt.class, "VillagerGolem", 99);
/* 107 */     a(wi.class, "EntityHorse", 100, 12623485, 15656192);
/*     */     
/* 109 */     a(yv.class, "Villager", 120, 5651507, 12422002);
/*     */     
/* 111 */     a(wz.class, "EnderCrystal", 200);
/*     */   }
/*     */   
/*     */   public static sa a(String paramString, ahb paramahb) {
/* 115 */     sa localsa = null;
/*     */     try {
/* 117 */       Class localClass = (Class)c.get(paramString);
/* 118 */       if (localClass != null) localsa = (sa)localClass.getConstructor(new Class[] { ahb.class }).newInstance(new Object[] { paramahb });
/*     */     }
/*     */     catch (Exception localException) {
/* 121 */       localException.printStackTrace();
/*     */     }
/* 123 */     return localsa;
/*     */   }
/*     */   
/*     */   public static sa a(dh paramdh, ahb paramahb) {
/* 127 */     sa localsa = null;
/*     */     
/* 129 */     if ("Minecart".equals(paramdh.j("id")))
/*     */     {
/*     */ 
/* 132 */       switch (paramdh.f("Type")) {
/*     */       case 1: 
/* 134 */         paramdh.a("id", "MinecartChest");
/* 135 */         break;
/*     */       case 2: 
/* 137 */         paramdh.a("id", "MinecartFurnace");
/* 138 */         break;
/*     */       case 0: 
/* 140 */         paramdh.a("id", "MinecartRideable");
/*     */       }
/*     */       
/*     */       
/* 144 */       paramdh.o("Type");
/*     */     }
/*     */     try
/*     */     {
/* 148 */       Class localClass = (Class)c.get(paramdh.j("id"));
/* 149 */       if (localClass != null) localsa = (sa)localClass.getConstructor(new Class[] { ahb.class }).newInstance(new Object[] { paramahb });
/*     */     }
/*     */     catch (Exception localException) {
/* 152 */       localException.printStackTrace();
/*     */     }
/* 154 */     if (localsa != null) {
/* 155 */       localsa.f(paramdh);
/*     */     } else {
/* 157 */       b.warn("Skipping Entity with id " + paramdh.j("id"));
/*     */     }
/* 159 */     return localsa;
/*     */   }
/*     */   
/*     */   public static sa a(int paramInt, ahb paramahb) {
/* 163 */     sa localsa = null;
/*     */     try {
/* 165 */       Class localClass = a(paramInt);
/* 166 */       if (localClass != null) localsa = (sa)localClass.getConstructor(new Class[] { ahb.class }).newInstance(new Object[] { paramahb });
/*     */     }
/*     */     catch (Exception localException) {
/* 169 */       localException.printStackTrace();
/*     */     }
/* 171 */     if (localsa == null) {
/* 172 */       b.warn("Skipping Entity with id " + paramInt);
/*     */     }
/* 174 */     return localsa;
/*     */   }
/*     */   
/*     */   public static int a(sa paramsa) {
/* 178 */     Class localClass = paramsa.getClass();
/*     */     
/* 180 */     return f.containsKey(localClass) ? ((Integer)f.get(localClass)).intValue() : 0;
/*     */   }
/*     */   
/*     */   public static Class a(int paramInt) {
/* 184 */     return (Class)e.get(Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public static String b(sa paramsa) {
/* 188 */     return (String)d.get(paramsa.getClass());
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
/*     */   public static String b(int paramInt)
/*     */   {
/* 201 */     Class localClass = a(paramInt);
/*     */     
/* 203 */     if (localClass != null) {
/* 204 */       return (String)d.get(localClass);
/*     */     }
/*     */     
/* 207 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static Set b()
/*     */   {
/* 214 */     return Collections.unmodifiableSet(g.keySet());
/*     */   }
/*     */   
/*     */   public static void a() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\sg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */