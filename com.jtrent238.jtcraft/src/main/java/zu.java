/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ 
/*     */ 
/*     */ public class zu
/*     */   extends zs
/*     */ {
/*  22 */   private static final Logger f = ;
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
/*  35 */   private rb g = new aaw();
/*  36 */   private rb h = new zv(this, "Repair", true, 2);
/*     */   
/*     */   private ahb i;
/*     */   
/*     */   private int j;
/*     */   
/*     */   private int k;
/*     */   
/*     */   private int l;
/*     */   
/*     */   public int a;
/*     */   private int m;
/*     */   private String n;
/*     */   private final yz o;
/*     */   
/*     */   public zu(yx paramyx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz)
/*     */   {
/*  53 */     this.i = paramahb;
/*  54 */     this.j = paramInt1;
/*  55 */     this.k = paramInt2;
/*  56 */     this.l = paramInt3;
/*  57 */     this.o = paramyz;
/*     */     
/*  59 */     a(new aay(this.h, 0, 27, 47));
/*  60 */     a(new aay(this.h, 1, 76, 47));
/*  61 */     a(new zw(this, this.g, 2, 134, 47, paramahb, paramInt1, paramInt2, paramInt3));
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
/* 107 */     for (int i1 = 0; i1 < 3; i1++) {
/* 108 */       for (int i2 = 0; i2 < 9; i2++) {
/* 109 */         a(new aay(paramyx, i2 + i1 * 9 + 9, 8 + i2 * 18, 84 + i1 * 18));
/*     */       }
/*     */     }
/* 112 */     for (i1 = 0; i1 < 9; i1++) {
/* 113 */       a(new aay(paramyx, i1, 8 + i1 * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/* 119 */     super.a(paramrb);
/*     */     
/* 121 */     if (paramrb == this.h) e();
/*     */   }
/*     */   
/*     */   public void e() {
/* 125 */     add localadd1 = this.h.a(0);
/* 126 */     this.a = 0;
/* 127 */     int i1 = 0;
/* 128 */     int i2 = 0;
/* 129 */     int i3 = 0;
/*     */     
/*     */ 
/*     */ 
/* 133 */     if (localadd1 == null) {
/* 134 */       this.g.a(0, null);
/* 135 */       this.a = 0;
/* 136 */       return;
/*     */     }
/* 138 */     add localadd2 = localadd1.m();
/* 139 */     add localadd3 = this.h.a(1);
/* 140 */     Map localMap1 = afv.a(localadd2);
/* 141 */     int i4 = 0;
/*     */     
/* 143 */     i2 += localadd1.C() + (localadd3 == null ? 0 : localadd3.C());
/*     */     
/*     */ 
/*     */ 
/* 147 */     this.m = 0;
/*     */     int i9;
/* 149 */     int i11; Map localMap2; if (localadd3 != null) {
/* 150 */       i4 = (localadd3.b() == ade.bR) && (ade.bR.g(localadd3).c() > 0) ? 1 : 0;
/*     */       int i5;
/* 152 */       int i7; if ((localadd2.g()) && (localadd2.b().a(localadd1, localadd3))) {
/* 153 */         i5 = Math.min(localadd2.j(), localadd2.l() / 4);
/* 154 */         if (i5 <= 0) {
/* 155 */           this.g.a(0, null);
/* 156 */           this.a = 0;
/* 157 */           return;
/*     */         }
/* 159 */         i7 = 0;
/* 160 */         while ((i5 > 0) && (i7 < localadd3.b)) {
/* 161 */           i9 = localadd2.j() - i5;
/* 162 */           localadd2.b(i9);
/* 163 */           i1 += Math.max(1, i5 / 100) + localMap1.size();
/*     */           
/* 165 */           i5 = Math.min(localadd2.j(), localadd2.l() / 4);
/* 166 */           i7++;
/*     */         }
/* 168 */         this.m = i7;
/*     */       } else {
/* 170 */         if ((i4 == 0) && ((localadd2.b() != localadd3.b()) || (!localadd2.g()))) {
/* 171 */           this.g.a(0, null);
/* 172 */           this.a = 0;
/* 173 */           return;
/*     */         }
/* 175 */         if ((localadd2.g()) && (i4 == 0)) {
/* 176 */           i5 = localadd1.l() - localadd1.j();
/* 177 */           i7 = localadd3.l() - localadd3.j();
/* 178 */           i9 = i7 + localadd2.l() * 12 / 100;
/* 179 */           int i10 = i5 + i9;
/* 180 */           i11 = localadd2.l() - i10;
/* 181 */           if (i11 < 0) { i11 = 0;
/*     */           }
/* 183 */           if (i11 < localadd2.k()) {
/* 184 */             localadd2.b(i11);
/* 185 */             i1 += Math.max(1, i9 / 100);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 191 */         localMap2 = afv.a(localadd3);
/*     */         
/* 193 */         for (localIterator1 = localMap2.keySet().iterator(); localIterator1.hasNext();) { i9 = ((Integer)localIterator1.next()).intValue();
/* 194 */           localaft = aft.b[i9];
/* 195 */           i11 = localMap1.containsKey(Integer.valueOf(i9)) ? ((Integer)localMap1.get(Integer.valueOf(i9))).intValue() : 0;
/* 196 */           i12 = ((Integer)localMap2.get(Integer.valueOf(i9))).intValue();
/* 197 */           i12++;i12 = i11 == i12 ? i12 : Math.max(i12, i11);
/* 198 */           int i13 = i12 - i11;
/* 199 */           boolean bool = localaft.a(localadd1);
/*     */           
/* 201 */           if ((this.o.bE.d) || (localadd1.b() == ade.bR)) { bool = true;
/*     */           }
/* 203 */           for (Iterator localIterator2 = localMap1.keySet().iterator(); localIterator2.hasNext();) { int i15 = ((Integer)localIterator2.next()).intValue();
/* 204 */             if ((i15 != i9) && (!localaft.a(aft.b[i15]))) {
/* 205 */               bool = false;
/*     */               
/* 207 */               i1 += i13;
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/* 213 */           if (bool) {
/* 214 */             if (i12 > localaft.b()) i12 = localaft.b();
/* 215 */             localMap1.put(Integer.valueOf(i9), Integer.valueOf(i12));
/* 216 */             int i14 = 0;
/*     */             
/* 218 */             switch (localaft.c()) {
/*     */             case 10: 
/* 220 */               i14 = 1;
/* 221 */               break;
/*     */             case 5: 
/* 223 */               i14 = 2;
/* 224 */               break;
/*     */             case 2: 
/* 226 */               i14 = 4;
/* 227 */               break;
/*     */             case 1: 
/* 229 */               i14 = 8;
/*     */             }
/*     */             
/*     */             
/* 233 */             if (i4 != 0) { i14 = Math.max(1, i14 / 2);
/*     */             }
/* 235 */             i1 += i14 * i13;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     aft localaft;
/*     */     int i12;
/* 242 */     if (StringUtils.isBlank(this.n)) {
/* 243 */       if (localadd1.u()) {
/* 244 */         i3 = localadd1.g() ? 7 : localadd1.b * 5;
/*     */         
/* 246 */         i1 += i3;
/*     */         
/*     */ 
/*     */ 
/* 250 */         localadd2.t();
/*     */       }
/* 252 */     } else if (!this.n.equals(localadd1.s())) {
/* 253 */       i3 = localadd1.g() ? 7 : localadd1.b * 5;
/*     */       
/* 255 */       i1 += i3;
/*     */       
/*     */ 
/* 258 */       if (localadd1.u()) {
/* 259 */         i2 += i3 / 2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 265 */       localadd2.c(this.n);
/*     */     }
/*     */     
/* 268 */     int i6 = 0;
/* 269 */     for (Iterator localIterator1 = localMap1.keySet().iterator(); localIterator1.hasNext();) { i9 = ((Integer)localIterator1.next()).intValue();
/* 270 */       localaft = aft.b[i9];
/* 271 */       i11 = ((Integer)localMap1.get(Integer.valueOf(i9))).intValue();
/* 272 */       i12 = 0;
/*     */       
/* 274 */       i6++;
/*     */       
/* 276 */       switch (localaft.c()) {
/*     */       case 10: 
/* 278 */         i12 = 1;
/* 279 */         break;
/*     */       case 5: 
/* 281 */         i12 = 2;
/* 282 */         break;
/*     */       case 2: 
/* 284 */         i12 = 4;
/* 285 */         break;
/*     */       case 1: 
/* 287 */         i12 = 8;
/*     */       }
/*     */       
/*     */       
/* 291 */       if (i4 != 0) { i12 = Math.max(1, i12 / 2);
/*     */       }
/* 293 */       i2 += i6 + i11 * i12;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 298 */     if (i4 != 0) { i2 = Math.max(1, i2 / 2);
/*     */     }
/* 300 */     this.a = (i2 + i1);
/* 301 */     if (i1 <= 0)
/*     */     {
/* 303 */       localadd2 = null;
/*     */     }
/* 305 */     if ((i3 == i1) && (i3 > 0) && (this.a >= 40))
/*     */     {
/*     */ 
/* 308 */       this.a = 39;
/*     */     }
/* 310 */     if ((this.a >= 40) && (!this.o.bE.d))
/*     */     {
/* 312 */       localadd2 = null;
/*     */     }
/*     */     
/* 315 */     if (localadd2 != null) {
/* 316 */       int i8 = localadd2.C();
/* 317 */       if ((localadd3 != null) && (i8 < localadd3.C())) i8 = localadd3.C();
/* 318 */       if (localadd2.u()) i8 -= 9;
/* 319 */       if (i8 < 0) i8 = 0;
/* 320 */       i8 += 2;
/*     */       
/* 322 */       localadd2.c(i8);
/* 323 */       afv.a(localMap1, localadd2);
/*     */     }
/*     */     
/* 326 */     this.g.a(0, localadd2);
/*     */     
/*     */ 
/* 329 */     b();
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
/*     */   public void a(aac paramaac)
/*     */   {
/* 347 */     super.a(paramaac);
/* 348 */     paramaac.a(this, 0, this.a);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2)
/*     */   {
/* 353 */     if (paramInt1 == 0) this.a = paramInt2;
/*     */   }
/*     */   
/*     */   public void b(yz paramyz)
/*     */   {
/* 358 */     super.b(paramyz);
/* 359 */     if (this.i.E) { return;
/*     */     }
/* 361 */     for (int i1 = 0; i1 < this.h.a(); i1++) {
/* 362 */       add localadd = this.h.a_(i1);
/* 363 */       if (localadd != null) {
/* 364 */         paramyz.a(localadd, false);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 371 */     if (this.i.a(this.j, this.k, this.l) != ajn.bQ) return false;
/* 372 */     if (paramyz.e(this.j + 0.5D, this.k + 0.5D, this.l + 0.5D) > 64.0D) return false;
/* 373 */     return true;
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/* 378 */     add localadd1 = null;
/* 379 */     aay localaay = (aay)this.c.get(paramInt);
/* 380 */     if ((localaay != null) && (localaay.e())) {
/* 381 */       add localadd2 = localaay.d();
/* 382 */       localadd1 = localadd2.m();
/*     */       
/* 384 */       if (paramInt == 2) {
/* 385 */         if (!a(localadd2, 3, 39, true)) {
/* 386 */           return null;
/*     */         }
/* 388 */         localaay.a(localadd2, localadd1);
/* 389 */       } else if ((paramInt == 0) || (paramInt == 1)) {
/* 390 */         if (!a(localadd2, 3, 39, false)) {
/* 391 */           return null;
/*     */         }
/* 393 */       } else if ((paramInt >= 3) && (paramInt < 39) && 
/* 394 */         (!a(localadd2, 0, 2, false))) {
/* 395 */         return null;
/*     */       }
/*     */       
/* 398 */       if (localadd2.b == 0) {
/* 399 */         localaay.c(null);
/*     */       } else {
/* 401 */         localaay.f();
/*     */       }
/* 403 */       if (localadd2.b == localadd1.b) {
/* 404 */         return null;
/*     */       }
/* 406 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 409 */     return localadd1;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 413 */     this.n = paramString;
/*     */     
/* 415 */     if (a(2).e()) {
/* 416 */       add localadd = a(2).d();
/*     */       
/* 418 */       if (StringUtils.isBlank(paramString)) {
/* 419 */         localadd.t();
/*     */       } else {
/* 421 */         localadd.c(this.n);
/*     */       }
/*     */     }
/*     */     
/* 425 */     e();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */