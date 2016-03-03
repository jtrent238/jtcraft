/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afv
/*     */ {
/*  15 */   private static final Random a = new Random();
/*     */   
/*     */   public static int a(int paramInt, add paramadd) {
/*  18 */     if (paramadd == null) {
/*  19 */       return 0;
/*     */     }
/*  21 */     dq localdq = paramadd.r();
/*  22 */     if (localdq == null) {
/*  23 */       return 0;
/*     */     }
/*  25 */     for (int i = 0; i < localdq.c(); i++) {
/*  26 */       int j = localdq.b(i).e("id");
/*  27 */       int k = localdq.b(i).e("lvl");
/*     */       
/*  29 */       if (j == paramInt) {
/*  30 */         return k;
/*     */       }
/*     */     }
/*  33 */     return 0;
/*     */   }
/*     */   
/*     */   public static Map a(add paramadd) {
/*  37 */     LinkedHashMap localLinkedHashMap = new LinkedHashMap();
/*  38 */     dq localdq = paramadd.b() == ade.bR ? ade.bR.g(paramadd) : paramadd.r();
/*     */     
/*  40 */     if (localdq != null) {
/*  41 */       for (int i = 0; i < localdq.c(); i++) {
/*  42 */         int j = localdq.b(i).e("id");
/*  43 */         int k = localdq.b(i).e("lvl");
/*     */         
/*  45 */         localLinkedHashMap.put(Integer.valueOf(j), Integer.valueOf(k));
/*     */       }
/*     */     }
/*     */     
/*  49 */     return localLinkedHashMap;
/*     */   }
/*     */   
/*     */   public static void a(Map paramMap, add paramadd) {
/*  53 */     dq localdq = new dq();
/*     */     
/*  55 */     for (Iterator localIterator = paramMap.keySet().iterator(); localIterator.hasNext();) { int i = ((Integer)localIterator.next()).intValue();
/*  56 */       dh localdh = new dh();
/*     */       
/*  58 */       localdh.a("id", (short)i);
/*  59 */       localdh.a("lvl", (short)((Integer)paramMap.get(Integer.valueOf(i))).intValue());
/*     */       
/*  61 */       localdq.a(localdh);
/*     */       
/*  63 */       if (paramadd.b() == ade.bR) {
/*  64 */         ade.bR.a(paramadd, new agc(i, ((Integer)paramMap.get(Integer.valueOf(i))).intValue()));
/*     */       }
/*     */     }
/*     */     
/*  68 */     if (localdq.c() > 0) {
/*  69 */       if (paramadd.b() != ade.bR) {
/*  70 */         paramadd.a("ench", localdq);
/*     */       }
/*  72 */     } else if (paramadd.p()) {
/*  73 */       paramadd.q().o("ench");
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(int paramInt, add[] paramArrayOfadd) {
/*  78 */     if (paramArrayOfadd == null) return 0;
/*  79 */     int i = 0;
/*  80 */     for (add localadd : paramArrayOfadd) {
/*  81 */       int m = a(paramInt, localadd);
/*  82 */       if (m > i) {
/*  83 */         i = m;
/*     */       }
/*     */     }
/*  86 */     return i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private static void a(afz paramafz, add paramadd)
/*     */   {
/*  94 */     if (paramadd == null) {
/*  95 */       return;
/*     */     }
/*  97 */     dq localdq = paramadd.r();
/*  98 */     if (localdq == null) {
/*  99 */       return;
/*     */     }
/* 101 */     for (int i = 0; i < localdq.c(); i++) {
/* 102 */       int j = localdq.b(i).e("id");
/* 103 */       int k = localdq.b(i).e("lvl");
/*     */       
/* 105 */       if (aft.b[j] != null) {
/* 106 */         paramafz.a(aft.b[j], k);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(afz paramafz, add[] paramArrayOfadd) {
/* 112 */     for (add localadd : paramArrayOfadd) {
/* 113 */       a(paramafz, localadd);
/*     */     }
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
/* 127 */   private static final agb b = new agb(null);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int a(add[] paramArrayOfadd, ro paramro)
/*     */   {
/* 137 */     b.a = 0;
/* 138 */     b.b = paramro;
/*     */     
/* 140 */     a(b, paramArrayOfadd);
/*     */     
/* 142 */     if (b.a > 25) {
/* 143 */       b.a = 25;
/*     */     }
/*     */     
/*     */ 
/* 147 */     return (b.a + 1 >> 1) + a.nextInt((b.a >> 1) + 1);
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
/* 160 */   private static final aga c = new aga(null);
/*     */   
/*     */   public static float a(sv paramsv1, sv paramsv2) {
/* 163 */     return a(paramsv1.be(), paramsv2.bd());
/*     */   }
/*     */   
/*     */   public static float a(add paramadd, sz paramsz) {
/* 167 */     c.a = 0.0F;
/* 168 */     c.b = paramsz;
/*     */     
/* 170 */     a(c, paramadd);
/*     */     
/* 172 */     return c.a;
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
/* 185 */   private static final afy d = new afy(null);
/*     */   
/*     */   public static void a(sv paramsv, sa paramsa) {
/* 188 */     d.b = paramsa;
/* 189 */     d.a = paramsv;
/* 190 */     a(d, paramsv.ak());
/* 191 */     if ((paramsa instanceof yz)) { a(d, paramsv.be());
/*     */     }
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
/* 204 */   private static final afx e = new afx(null);
/*     */   
/*     */   public static void b(sv paramsv, sa paramsa) {
/* 207 */     e.a = paramsv;
/* 208 */     e.b = paramsa;
/* 209 */     a(e, paramsv.ak());
/* 210 */     if ((paramsv instanceof yz)) a(e, paramsv.be());
/*     */   }
/*     */   
/*     */   public static int b(sv paramsv1, sv paramsv2) {
/* 214 */     return a(aft.o.B, paramsv1.be());
/*     */   }
/*     */   
/*     */   public static int a(sv paramsv) {
/* 218 */     return a(aft.p.B, paramsv.be());
/*     */   }
/*     */   
/*     */   public static int b(sv paramsv) {
/* 222 */     return a(aft.i.B, paramsv.ak());
/*     */   }
/*     */   
/*     */   public static int c(sv paramsv) {
/* 226 */     return a(aft.r.B, paramsv.be());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean e(sv paramsv)
/*     */   {
/* 234 */     return a(aft.s.B, paramsv.be()) > 0;
/*     */   }
/*     */   
/*     */   public static int f(sv paramsv) {
/* 238 */     return a(aft.u.B, paramsv.be());
/*     */   }
/*     */   
/*     */   public static int g(sv paramsv) {
/* 242 */     return a(aft.z.B, paramsv.be());
/*     */   }
/*     */   
/*     */   public static int h(sv paramsv) {
/* 246 */     return a(aft.A.B, paramsv.be());
/*     */   }
/*     */   
/*     */   public static int i(sv paramsv) {
/* 250 */     return a(aft.q.B, paramsv.be());
/*     */   }
/*     */   
/*     */   public static boolean j(sv paramsv) {
/* 254 */     return a(aft.j.B, paramsv.ak()) > 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static add a(aft paramaft, sv paramsv)
/*     */   {
/* 262 */     for (add localadd : paramsv.ak()) {
/* 263 */       if ((localadd != null) && (a(paramaft.B, localadd) > 0)) {
/* 264 */         return localadd;
/*     */       }
/*     */     }
/*     */     
/* 268 */     return null;
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
/*     */   public static int a(Random paramRandom, int paramInt1, int paramInt2, add paramadd)
/*     */   {
/* 283 */     adb localadb = paramadd.b();
/* 284 */     int i = localadb.c();
/*     */     
/* 286 */     if (i <= 0)
/*     */     {
/* 288 */       return 0;
/*     */     }
/*     */     
/* 291 */     if (paramInt2 > 15) {
/* 292 */       paramInt2 = 15;
/*     */     }
/* 294 */     int j = paramRandom.nextInt(8) + 1 + (paramInt2 >> 1) + paramRandom.nextInt(paramInt2 + 1);
/* 295 */     if (paramInt1 == 0) {
/* 296 */       return Math.max(j / 3, 1);
/*     */     }
/* 298 */     if (paramInt1 == 1) {
/* 299 */       return j * 2 / 3 + 1;
/*     */     }
/* 301 */     return Math.max(j, paramInt2 * 2);
/*     */   }
/*     */   
/*     */   public static add a(Random paramRandom, add paramadd, int paramInt) {
/* 305 */     List localList = b(paramRandom, paramadd, paramInt);
/* 306 */     int i = paramadd.b() == ade.aG ? 1 : 0;
/*     */     
/* 308 */     if (i != 0) { paramadd.a(ade.bR);
/*     */     }
/* 310 */     if (localList != null) {
/* 311 */       for (agc localagc : localList) {
/* 312 */         if (i != 0) {
/* 313 */           ade.bR.a(paramadd, localagc);
/*     */         } else {
/* 315 */           paramadd.a(localagc.b, localagc.c);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 320 */     return paramadd;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static List b(Random paramRandom, add paramadd, int paramInt)
/*     */   {
/* 331 */     adb localadb = paramadd.b();
/* 332 */     int i = localadb.c();
/*     */     
/* 334 */     if (i <= 0) {
/* 335 */       return null;
/*     */     }
/* 337 */     i /= 2;
/* 338 */     i = 1 + paramRandom.nextInt((i >> 1) + 1) + paramRandom.nextInt((i >> 1) + 1);
/*     */     
/* 340 */     int j = i + paramInt;
/*     */     
/*     */ 
/* 343 */     float f = (paramRandom.nextFloat() + paramRandom.nextFloat() - 1.0F) * 0.15F;
/* 344 */     int k = (int)(j * (1.0F + f) + 0.5F);
/* 345 */     if (k < 1) {
/* 346 */       k = 1;
/*     */     }
/*     */     
/* 349 */     ArrayList localArrayList = null;
/*     */     
/* 351 */     Map localMap = b(k, paramadd);
/* 352 */     if ((localMap != null) && (!localMap.isEmpty()))
/*     */     {
/* 354 */       agc localagc1 = (agc)qv.a(paramRandom, localMap.values());
/*     */       
/* 356 */       if (localagc1 != null) {
/* 357 */         localArrayList = new ArrayList();
/* 358 */         localArrayList.add(localagc1);
/*     */         
/* 360 */         int m = k;
/* 361 */         while (paramRandom.nextInt(50) <= m)
/*     */         {
/*     */ 
/* 364 */           Iterator localIterator1 = localMap.keySet().iterator();
/* 365 */           Object localObject; while (localIterator1.hasNext()) {
/* 366 */             localObject = (Integer)localIterator1.next();
/* 367 */             int n = 1;
/* 368 */             for (agc localagc2 : localArrayList) {
/* 369 */               if (!localagc2.b.a(aft.b[localObject.intValue()])) {
/* 370 */                 n = 0;
/* 371 */                 break;
/*     */               }
/*     */             }
/* 374 */             if (n == 0) {
/* 375 */               localIterator1.remove();
/*     */             }
/*     */           }
/*     */           
/* 379 */           if (!localMap.isEmpty()) {
/* 380 */             localObject = (agc)qv.a(paramRandom, localMap.values());
/* 381 */             localArrayList.add(localObject);
/*     */           }
/*     */           
/* 384 */           m >>= 1;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 389 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public static Map b(int paramInt, add paramadd) {
/* 393 */     adb localadb = paramadd.b();
/* 394 */     HashMap localHashMap = null;
/* 395 */     int i = paramadd.b() == ade.aG ? 1 : 0;
/*     */     
/* 397 */     for (aft localaft : aft.b) {
/* 398 */       if (localaft != null)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/* 403 */         if ((localaft.C.a(localadb)) || (i != 0))
/*     */         {
/*     */ 
/*     */ 
/* 407 */           for (int m = localaft.d(); m <= localaft.b(); m++)
/* 408 */             if ((paramInt >= localaft.a(m)) && (paramInt <= localaft.b(m)))
/*     */             {
/* 410 */               if (localHashMap == null) {
/* 411 */                 localHashMap = new HashMap();
/*     */               }
/*     */               
/* 414 */               localHashMap.put(Integer.valueOf(localaft.B), new agc(localaft, m));
/*     */             }
/*     */         }
/*     */       }
/*     */     }
/* 419 */     return localHashMap;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */