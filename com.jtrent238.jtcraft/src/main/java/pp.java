/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pp
/*     */ {
/*  18 */   protected static Map a = new HashMap();
/*     */   
/*  20 */   public static List b = new ArrayList();
/*  21 */   public static List c = new ArrayList();
/*  22 */   public static List d = new ArrayList();
/*  23 */   public static List e = new ArrayList();
/*     */   
/*  25 */   public static ph f = new pe("stat.leaveGame", new fr("stat.leaveGame", new Object[0])).i().h();
/*     */   
/*  27 */   public static ph g = new pe("stat.playOneMinute", new fr("stat.playOneMinute", new Object[0]), ph.h).i().h();
/*     */   
/*  29 */   public static ph h = new pe("stat.walkOneCm", new fr("stat.walkOneCm", new Object[0]), ph.i).i().h();
/*  30 */   public static ph i = new pe("stat.swimOneCm", new fr("stat.swimOneCm", new Object[0]), ph.i).i().h();
/*  31 */   public static ph j = new pe("stat.fallOneCm", new fr("stat.fallOneCm", new Object[0]), ph.i).i().h();
/*  32 */   public static ph k = new pe("stat.climbOneCm", new fr("stat.climbOneCm", new Object[0]), ph.i).i().h();
/*  33 */   public static ph l = new pe("stat.flyOneCm", new fr("stat.flyOneCm", new Object[0]), ph.i).i().h();
/*  34 */   public static ph m = new pe("stat.diveOneCm", new fr("stat.diveOneCm", new Object[0]), ph.i).i().h();
/*  35 */   public static ph n = new pe("stat.minecartOneCm", new fr("stat.minecartOneCm", new Object[0]), ph.i).i().h();
/*  36 */   public static ph o = new pe("stat.boatOneCm", new fr("stat.boatOneCm", new Object[0]), ph.i).i().h();
/*  37 */   public static ph p = new pe("stat.pigOneCm", new fr("stat.pigOneCm", new Object[0]), ph.i).i().h();
/*  38 */   public static ph q = new pe("stat.horseOneCm", new fr("stat.horseOneCm", new Object[0]), ph.i).i().h();
/*     */   
/*  40 */   public static ph r = new pe("stat.jump", new fr("stat.jump", new Object[0])).i().h();
/*  41 */   public static ph s = new pe("stat.drop", new fr("stat.drop", new Object[0])).i().h();
/*     */   
/*  43 */   public static ph t = new pe("stat.damageDealt", new fr("stat.damageDealt", new Object[0]), ph.j).h();
/*  44 */   public static ph u = new pe("stat.damageTaken", new fr("stat.damageTaken", new Object[0]), ph.j).h();
/*  45 */   public static ph v = new pe("stat.deaths", new fr("stat.deaths", new Object[0])).h();
/*  46 */   public static ph w = new pe("stat.mobKills", new fr("stat.mobKills", new Object[0])).h();
/*  47 */   public static ph x = new pe("stat.animalsBred", new fr("stat.animalsBred", new Object[0])).h();
/*  48 */   public static ph y = new pe("stat.playerKills", new fr("stat.playerKills", new Object[0])).h();
/*  49 */   public static ph z = new pe("stat.fishCaught", new fr("stat.fishCaught", new Object[0])).h();
/*  50 */   public static ph A = new pe("stat.junkFished", new fr("stat.junkFished", new Object[0])).h();
/*  51 */   public static ph B = new pe("stat.treasureFished", new fr("stat.treasureFished", new Object[0])).h();
/*     */   
/*  53 */   public static final ph[] C = new ph['က'];
/*  54 */   public static final ph[] D = new ph['紀'];
/*  55 */   public static final ph[] E = new ph['紀'];
/*  56 */   public static final ph[] F = new ph['紀'];
/*     */   
/*     */   public static void a() {
/*  59 */     c();
/*  60 */     d();
/*  61 */     e();
/*  62 */     b();
/*     */     
/*  64 */     pc.a();
/*  65 */     sg.a();
/*     */   }
/*     */   
/*     */   private static void b() {
/*  69 */     HashSet localHashSet = new HashSet();
/*     */     
/*  71 */     for (Iterator localIterator = afe.a().b().iterator(); localIterator.hasNext();) { localObject = (afg)localIterator.next();
/*  72 */       if (((afg)localObject).b() != null)
/*  73 */         localHashSet.add(((afg)localObject).b().b()); }
/*     */     Object localObject;
/*  75 */     for (localIterator = afa.a().b().values().iterator(); localIterator.hasNext();) { localObject = (add)localIterator.next();
/*  76 */       localHashSet.add(((add)localObject).b());
/*     */     }
/*     */     
/*  79 */     for (localIterator = localHashSet.iterator(); localIterator.hasNext();) { localObject = (adb)localIterator.next();
/*  80 */       if (localObject != null)
/*     */       {
/*  82 */         int i1 = adb.b((adb)localObject);
/*  83 */         D[i1] = new pf("stat.craftItem." + i1, new fr("stat.craftItem", new Object[] { new add((adb)localObject).E() }), (adb)localObject).h();
/*     */       }
/*     */     }
/*  86 */     a(D);
/*     */   }
/*     */   
/*     */   private static void c() {
/*  90 */     for (aji localaji : aji.c) {
/*  91 */       if (adb.a(localaji) != null)
/*     */       {
/*  93 */         int i1 = aji.b(localaji);
/*  94 */         if (localaji.G()) {
/*  95 */           C[i1] = new pf("stat.mineBlock." + i1, new fr("stat.mineBlock", new Object[] { new add(localaji).E() }), adb.a(localaji)).h();
/*  96 */           e.add((pf)C[i1]);
/*     */         }
/*     */       }
/*     */     }
/* 100 */     a(C);
/*     */   }
/*     */   
/*     */   private static void d() {
/* 104 */     for (adb localadb : adb.e) {
/* 105 */       if (localadb != null)
/*     */       {
/* 107 */         int i1 = adb.b(localadb);
/*     */         
/* 109 */         E[i1] = new pf("stat.useItem." + i1, new fr("stat.useItem", new Object[] { new add(localadb).E() }), localadb).h();
/*     */         
/* 111 */         if (!(localadb instanceof abh)) {
/* 112 */           d.add((pf)E[i1]);
/*     */         }
/*     */       }
/*     */     }
/* 116 */     a(E);
/*     */   }
/*     */   
/*     */   private static void e() {
/* 120 */     for (adb localadb : adb.e) {
/* 121 */       if (localadb != null)
/*     */       {
/* 123 */         int i1 = adb.b(localadb);
/*     */         
/* 125 */         if (localadb.p()) {
/* 126 */           F[i1] = new pf("stat.breakItem." + i1, new fr("stat.breakItem", new Object[] { new add(localadb).E() }), localadb).h();
/*     */         }
/*     */       }
/*     */     }
/* 130 */     a(F);
/*     */   }
/*     */   
/*     */   private static void a(ph[] paramArrayOfph) {
/* 134 */     a(paramArrayOfph, ajn.j, ajn.i);
/* 135 */     a(paramArrayOfph, ajn.l, ajn.k);
/*     */     
/* 137 */     a(paramArrayOfph, ajn.aP, ajn.aK);
/* 138 */     a(paramArrayOfph, ajn.am, ajn.al);
/* 139 */     a(paramArrayOfph, ajn.ay, ajn.ax);
/*     */     
/* 141 */     a(paramArrayOfph, ajn.aS, ajn.aR);
/* 142 */     a(paramArrayOfph, ajn.bV, ajn.bU);
/* 143 */     a(paramArrayOfph, ajn.aA, ajn.az);
/* 144 */     a(paramArrayOfph, ajn.bv, ajn.bu);
/*     */     
/* 146 */     a(paramArrayOfph, ajn.Q, ajn.P);
/* 147 */     a(paramArrayOfph, ajn.T, ajn.U);
/* 148 */     a(paramArrayOfph, ajn.bw, ajn.bx);
/*     */     
/* 150 */     a(paramArrayOfph, ajn.c, ajn.d);
/* 151 */     a(paramArrayOfph, ajn.ak, ajn.d);
/*     */   }
/*     */   
/*     */   private static void a(ph[] paramArrayOfph, aji paramaji1, aji paramaji2) {
/* 155 */     int i1 = aji.b(paramaji1);
/* 156 */     int i2 = aji.b(paramaji2);
/*     */     
/* 158 */     if ((paramArrayOfph[i1] != null) && (paramArrayOfph[i2] == null))
/*     */     {
/* 160 */       paramArrayOfph[i2] = paramArrayOfph[i1];
/* 161 */       return;
/*     */     }
/*     */     
/* 164 */     b.remove(paramArrayOfph[i1]);
/* 165 */     e.remove(paramArrayOfph[i1]);
/* 166 */     c.remove(paramArrayOfph[i1]);
/* 167 */     paramArrayOfph[i1] = paramArrayOfph[i2];
/*     */   }
/*     */   
/*     */   public static ph a(sh paramsh) {
/* 171 */     String str = sg.b(paramsh.a);
/* 172 */     if (str == null) return null;
/* 173 */     return new ph("stat.killEntity." + str, new fr("stat.entityKill", new Object[] { new fr("entity." + str + ".name", new Object[0]) })).h();
/*     */   }
/*     */   
/*     */   public static ph b(sh paramsh) {
/* 177 */     String str = sg.b(paramsh.a);
/* 178 */     if (str == null) return null;
/* 179 */     return new ph("stat.entityKilledBy." + str, new fr("stat.entityKilledBy", new Object[] { new fr("entity." + str + ".name", new Object[0]) })).h();
/*     */   }
/*     */   
/*     */   public static ph a(String paramString) {
/* 183 */     return (ph)a.get(paramString);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */