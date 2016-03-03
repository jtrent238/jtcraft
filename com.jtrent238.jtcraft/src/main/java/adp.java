/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class adp
/*     */   extends adb
/*     */ {
/*  25 */   private HashMap a = new HashMap();
/*  26 */   private static final Map b = new LinkedHashMap();
/*     */   private rf c;
/*     */   private rf d;
/*     */   private rf m;
/*     */   
/*     */   public adp()
/*     */   {
/*  33 */     e(1);
/*  34 */     a(true);
/*  35 */     f(0);
/*  36 */     a(abt.k);
/*     */   }
/*     */   
/*     */   public List g(add paramadd) {
/*  40 */     if ((!paramadd.p()) || (!paramadd.q().b("CustomPotionEffects", 9))) {
/*  41 */       localObject = (List)this.a.get(Integer.valueOf(paramadd.k()));
/*     */       
/*  43 */       if (localObject == null) {
/*  44 */         localObject = aen.b(paramadd.k(), false);
/*  45 */         this.a.put(Integer.valueOf(paramadd.k()), localObject);
/*     */       }
/*     */       
/*  48 */       return (List)localObject;
/*     */     }
/*  50 */     Object localObject = new ArrayList();
/*  51 */     dq localdq = paramadd.q().c("CustomPotionEffects", 10);
/*     */     
/*  53 */     for (int i = 0; i < localdq.c(); i++) {
/*  54 */       dh localdh = localdq.b(i);
/*  55 */       rw localrw = rw.b(localdh);
/*  56 */       if (localrw != null) {
/*  57 */         ((List)localObject).add(localrw);
/*     */       }
/*     */     }
/*     */     
/*  61 */     return (List)localObject;
/*     */   }
/*     */   
/*     */   public List c(int paramInt)
/*     */   {
/*  66 */     List localList = (List)this.a.get(Integer.valueOf(paramInt));
/*  67 */     if (localList == null) {
/*  68 */       localList = aen.b(paramInt, false);
/*  69 */       this.a.put(Integer.valueOf(paramInt), localList);
/*     */     }
/*  71 */     return localList;
/*     */   }
/*     */   
/*     */   public add b(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/*  76 */     if (!paramyz.bE.d) { paramadd.b -= 1;
/*     */     }
/*  78 */     if (!paramahb.E) {
/*  79 */       List localList = g(paramadd);
/*  80 */       if (localList != null) {
/*  81 */         for (rw localrw : localList) {
/*  82 */           paramyz.c(new rw(localrw));
/*     */         }
/*     */       }
/*     */     }
/*  86 */     if (!paramyz.bE.d) {
/*  87 */       if (paramadd.b <= 0) {
/*  88 */         return new add(ade.bo);
/*     */       }
/*  90 */       paramyz.bm.a(new add(ade.bo));
/*     */     }
/*     */     
/*     */ 
/*  94 */     return paramadd;
/*     */   }
/*     */   
/*     */   public int d_(add paramadd)
/*     */   {
/*  99 */     return 32;
/*     */   }
/*     */   
/*     */   public aei d(add paramadd)
/*     */   {
/* 104 */     return aei.c;
/*     */   }
/*     */   
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/* 109 */     if (g(paramadd.k())) {
/* 110 */       if (!paramyz.bE.d) paramadd.b -= 1;
/* 111 */       paramahb.a(paramyz, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 112 */       if (!paramahb.E) paramahb.d(new zo(paramahb, paramyz, paramadd));
/* 113 */       return paramadd;
/*     */     }
/* 115 */     paramyz.a(paramadd, d_(paramadd));
/* 116 */     return paramadd;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 121 */     return false;
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt)
/*     */   {
/* 126 */     if (g(paramInt)) {
/* 127 */       return this.c;
/*     */     }
/* 129 */     return this.d;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 134 */     if (paramInt2 == 0) {
/* 135 */       return this.m;
/*     */     }
/* 137 */     return super.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static boolean g(int paramInt) {
/* 141 */     return (paramInt & 0x4000) != 0;
/*     */   }
/*     */   
/*     */   public int h(int paramInt) {
/* 145 */     return aen.a(paramInt, false);
/*     */   }
/*     */   
/*     */   public int a(add paramadd, int paramInt)
/*     */   {
/* 150 */     if (paramInt > 0) {
/* 151 */       return 16777215;
/*     */     }
/* 153 */     return h(paramadd.k());
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/* 158 */     return true;
/*     */   }
/*     */   
/*     */   public boolean i(int paramInt) {
/* 162 */     List localList = c(paramInt);
/* 163 */     if ((localList == null) || (localList.isEmpty())) {
/* 164 */       return false;
/*     */     }
/* 166 */     for (rw localrw : localList) {
/* 167 */       if (rv.a[localrw.a()].b()) {
/* 168 */         return true;
/*     */       }
/*     */     }
/* 171 */     return false;
/*     */   }
/*     */   
/*     */   public String n(add paramadd)
/*     */   {
/* 176 */     if (paramadd.k() == 0) {
/* 177 */       return dd.a("item.emptyPotion.name").trim();
/*     */     }
/*     */     
/* 180 */     String str1 = "";
/* 181 */     if (g(paramadd.k())) {
/* 182 */       str1 = dd.a("potion.prefix.grenade").trim() + " ";
/*     */     }
/*     */     
/* 185 */     List localList = ade.bn.g(paramadd);
/* 186 */     if ((localList != null) && (!localList.isEmpty())) {
/* 187 */       str2 = ((rw)localList.get(0)).f();
/* 188 */       str2 = str2 + ".postfix";
/* 189 */       return str1 + dd.a(str2).trim();
/*     */     }
/* 191 */     String str2 = aen.c(paramadd.k());
/* 192 */     return dd.a(str2).trim() + " " + super.n(paramadd);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*     */   {
/* 198 */     if (paramadd.k() == 0) {
/* 199 */       return;
/*     */     }
/*     */     
/* 202 */     List localList = ade.bn.g(paramadd);
/* 203 */     HashMultimap localHashMultimap = HashMultimap.create();
/*     */     Object localObject1;
/* 205 */     Object localObject2; Object localObject3; if ((localList != null) && (!localList.isEmpty())) {
/* 206 */       for (localObject1 = localList.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (rw)((Iterator)localObject1).next();
/* 207 */         localObject3 = dd.a(((rw)localObject2).f()).trim();
/* 208 */         rv localrv = rv.a[localObject2.a()];
/* 209 */         Map localMap = localrv.k();
/*     */         
/* 211 */         if ((localMap != null) && (localMap.size() > 0)) {
/* 212 */           for (Map.Entry localEntry : localMap.entrySet()) {
/* 213 */             tj localtj1 = (tj)localEntry.getValue();
/* 214 */             tj localtj2 = new tj(localtj1.b(), localrv.a(((rw)localObject2).c(), localtj1), localtj1.c());
/* 215 */             localHashMultimap.put(((th)localEntry.getKey()).a(), localtj2);
/*     */           }
/*     */         }
/*     */         
/* 219 */         if (((rw)localObject2).c() > 0) {
/* 220 */           localObject3 = (String)localObject3 + " " + dd.a(new StringBuilder().append("potion.potency.").append(((rw)localObject2).c()).toString()).trim();
/*     */         }
/*     */         
/* 223 */         if (((rw)localObject2).b() > 20) {
/* 224 */           localObject3 = (String)localObject3 + " (" + rv.a((rw)localObject2) + ")";
/*     */         }
/*     */         
/* 227 */         if (localrv.f()) {
/* 228 */           paramList.add(a.m + (String)localObject3);
/*     */         } else {
/* 230 */           paramList.add(a.h + (String)localObject3);
/*     */         }
/*     */       }
/*     */     } else {
/* 234 */       localObject1 = dd.a("potion.empty").trim();
/* 235 */       paramList.add(a.h + (String)localObject1);
/*     */     }
/*     */     
/* 238 */     if (!localHashMultimap.isEmpty()) {
/* 239 */       paramList.add("");
/* 240 */       paramList.add(a.f + dd.a("potion.effects.whenDrank"));
/*     */       
/* 242 */       for (localObject1 = localHashMultimap.entries().iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
/* 243 */         localObject3 = (tj)((Map.Entry)localObject2).getValue();
/* 244 */         double d1 = ((tj)localObject3).d();
/*     */         
/*     */         double d2;
/* 247 */         if ((((tj)localObject3).c() == 1) || (((tj)localObject3).c() == 2)) {
/* 248 */           d2 = ((tj)localObject3).d() * 100.0D;
/*     */         } else {
/* 250 */           d2 = ((tj)localObject3).d();
/*     */         }
/*     */         
/* 253 */         if (d1 > 0.0D) {
/* 254 */           paramList.add(a.j + dd.a(new StringBuilder().append("attribute.modifier.plus.").append(((tj)localObject3).c()).toString(), new Object[] { add.a.format(d2), dd.a("attribute.name." + (String)((Map.Entry)localObject2).getKey()) }));
/*     */         }
/* 256 */         else if (d1 < 0.0D) {
/* 257 */           d2 *= -1.0D;
/* 258 */           paramList.add(a.m + dd.a(new StringBuilder().append("attribute.modifier.take.").append(((tj)localObject3).c()).toString(), new Object[] { add.a.format(d2), dd.a("attribute.name." + (String)((Map.Entry)localObject2).getKey()) }));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean e(add paramadd)
/*     */   {
/* 267 */     List localList = g(paramadd);
/* 268 */     return (localList != null) && (!localList.isEmpty());
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 273 */     super.a(paramadb, paramabt, paramList);
/*     */     int j;
/* 275 */     if (b.isEmpty()) {
/* 276 */       for (int i = 0; i <= 15; i++) {
/* 277 */         for (j = 0; j <= 1; j++) {
/* 278 */           int k = i;
/* 279 */           if (j == 0) {
/* 280 */             k |= 0x2000;
/*     */           } else {
/* 282 */             k |= 0x4000;
/*     */           }
/* 284 */           for (int n = 0; n <= 2; n++) {
/* 285 */             int i1 = k;
/* 286 */             if (n != 0)
/*     */             {
/* 288 */               if (n == 1) {
/* 289 */                 i1 |= 0x20;
/* 290 */               } else if (n == 2) {
/* 291 */                 i1 |= 0x40;
/*     */               }
/*     */             }
/* 294 */             List localList = aen.b(i1, false);
/*     */             
/* 296 */             if ((localList != null) && (!localList.isEmpty())) {
/* 297 */               b.put(localList, Integer.valueOf(i1));
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 304 */     for (Iterator localIterator = b.values().iterator(); localIterator.hasNext();) { j = ((Integer)localIterator.next()).intValue();
/* 305 */       paramList.add(new add(paramadb, 1, j));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 311 */     this.d = paramrg.a(w() + "_" + "bottle_drinkable");
/* 312 */     this.c = paramrg.a(w() + "_" + "bottle_splash");
/* 313 */     this.m = paramrg.a(w() + "_" + "overlay");
/*     */   }
/*     */   
/*     */   public static rf b(String paramString) {
/* 317 */     if (paramString.equals("bottle_drinkable")) return ade.bn.d;
/* 318 */     if (paramString.equals("bottle_splash")) return ade.bn.c;
/* 319 */     if (paramString.equals("overlay")) return ade.bn.m;
/* 320 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */