/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bcc
/*     */   extends bbw
/*     */ {
/*  24 */   private static final Logger a = ;
/*     */   
/*     */   private final bao f;
/*     */   
/*  28 */   private final List g = new ArrayList();
/*  29 */   private final List h = new ArrayList();
/*  30 */   private final List i = new ArrayList();
/*     */   private int j;
/*     */   private boolean k;
/*     */   
/*     */   public bcc(bao parambao) {
/*  35 */     this.f = parambao;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  39 */     if (this.f.u.m == zb.c) { return;
/*     */     }
/*  41 */     int m = i();
/*  42 */     int n = 0;
/*  43 */     int i1 = 0;
/*  44 */     int i2 = this.i.size();
/*  45 */     float f1 = this.f.u.q * 0.9F + 0.1F;
/*     */     
/*  47 */     if (i2 <= 0) { return;
/*     */     }
/*  49 */     if (e()) {
/*  50 */       n = 1;
/*     */     }
/*     */     
/*  53 */     float f2 = h();
/*  54 */     int i3 = qh.f(f() / f2);
/*     */     
/*  56 */     GL11.glPushMatrix();
/*  57 */     GL11.glTranslatef(2.0F, 20.0F, 0.0F);
/*  58 */     GL11.glScalef(f2, f2, 1.0F);
/*     */     int i6;
/*  60 */     int i9; int i10; for (int i4 = 0; (i4 + this.j < this.i.size()) && (i4 < m); i4++) {
/*  61 */       bak localbak = (bak)this.i.get(i4 + this.j);
/*  62 */       if (localbak != null) {
/*  63 */         i6 = paramInt - localbak.b();
/*     */         
/*  65 */         if ((i6 < 200) || (n != 0)) {
/*  66 */           double d = i6 / 200.0D;
/*  67 */           d = 1.0D - d;
/*  68 */           d *= 10.0D;
/*  69 */           if (d < 0.0D) d = 0.0D;
/*  70 */           if (d > 1.0D) d = 1.0D;
/*  71 */           d *= d;
/*  72 */           i9 = (int)(255.0D * d);
/*  73 */           if (n != 0) i9 = 255;
/*  74 */           i9 = (int)(i9 * f1);
/*     */           
/*  76 */           i1++;
/*     */           
/*  78 */           if (i9 > 3) {
/*  79 */             i10 = 0;
/*  80 */             int i11 = -i4 * 9;
/*  81 */             a(i10, i11 - 9, i10 + i3 + 4, i11, i9 / 2 << 24);
/*     */             
/*  83 */             String str = localbak.a().d();
/*     */             
/*  85 */             this.f.l.a(str, i10, i11 - 8, 16777215 + (i9 << 24));
/*  86 */             GL11.glDisable(3008);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  91 */     if (n != 0) {
/*  92 */       i4 = this.f.l.a;
/*  93 */       GL11.glTranslatef(-3.0F, 0.0F, 0.0F);
/*     */       
/*  95 */       int i5 = i2 * i4 + i2;
/*  96 */       i6 = i1 * i4 + i1;
/*  97 */       int i7 = this.j * i6 / i2;
/*  98 */       int i8 = i6 * i6 / i5;
/*     */       
/* 100 */       if (i5 != i6) {
/* 101 */         i9 = i7 > 0 ? 170 : 96;
/* 102 */         i10 = this.k ? 13382451 : 3355562;
/*     */         
/* 104 */         a(0, -i7, 2, -i7 - i8, i10 + (i9 << 24));
/* 105 */         a(2, -i7, 1, -i7 - i8, 13421772 + (i9 << 24));
/*     */       }
/*     */     }
/*     */     
/* 109 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public void a() {
/* 113 */     this.i.clear();
/* 114 */     this.h.clear();
/* 115 */     this.g.clear();
/*     */   }
/*     */   
/*     */   public void a(fj paramfj) {
/* 119 */     a(paramfj, 0);
/*     */   }
/*     */   
/*     */   public void a(fj paramfj, int paramInt) {
/* 123 */     a(paramfj, paramInt, this.f.r.c(), false);
/* 124 */     a.info("[CHAT] " + paramfj.c());
/*     */   }
/*     */   
/*     */   private String b(String paramString) {
/* 128 */     if (bao.B().u.n) {
/* 129 */       return paramString;
/*     */     }
/* 131 */     return a.a(paramString);
/*     */   }
/*     */   
/*     */   private void a(fj paramfj, int paramInt1, int paramInt2, boolean paramBoolean)
/*     */   {
/* 136 */     if (paramInt1 != 0) {
/* 137 */       c(paramInt1);
/*     */     }
/*     */     
/* 140 */     int m = qh.d(f() / h());
/* 141 */     int n = 0;
/* 142 */     fq localfq1 = new fq("");
/* 143 */     ArrayList localArrayList1 = Lists.newArrayList();
/* 144 */     ArrayList localArrayList2 = Lists.newArrayList(paramfj);
/*     */     Object localObject2;
/* 146 */     for (int i1 = 0; i1 < localArrayList2.size(); i1++) {
/* 147 */       localObject1 = (fj)localArrayList2.get(i1);
/* 148 */       localObject2 = b(((fj)localObject1).b().j() + ((fj)localObject1).e());
/* 149 */       int i2 = this.f.l.a((String)localObject2);
/* 150 */       fq localfq2 = new fq((String)localObject2);
/* 151 */       localfq2.a(((fj)localObject1).b().l());
/* 152 */       int i3 = 0;
/*     */       
/* 154 */       if (n + i2 > m) {
/* 155 */         String str1 = this.f.l.a((String)localObject2, m - n, false);
/* 156 */         String str2 = str1.length() < ((String)localObject2).length() ? ((String)localObject2).substring(str1.length()) : null;
/*     */         
/* 158 */         if ((str2 != null) && (str2.length() > 0)) {
/* 159 */           int i4 = str1.lastIndexOf(" ");
/* 160 */           if ((i4 >= 0) && (this.f.l.a(((String)localObject2).substring(0, i4)) > 0)) {
/* 161 */             str1 = ((String)localObject2).substring(0, i4);
/* 162 */             str2 = ((String)localObject2).substring(i4);
/*     */           }
/*     */           
/* 165 */           fq localfq3 = new fq(str2);
/* 166 */           localfq3.a(((fj)localObject1).b().l());
/* 167 */           localArrayList2.add(i1 + 1, localfq3);
/*     */         }
/*     */         
/* 170 */         localObject2 = str1;
/* 171 */         i2 = this.f.l.a((String)localObject2);
/* 172 */         localfq2 = new fq((String)localObject2);
/* 173 */         localfq2.a(((fj)localObject1).b().l());
/* 174 */         i3 = 1;
/*     */       }
/*     */       
/* 177 */       if (n + i2 <= m) {
/* 178 */         n += i2;
/*     */         
/* 180 */         localfq1.a(localfq2);
/*     */       } else {
/* 182 */         i3 = 1;
/*     */       }
/*     */       
/* 185 */       if (i3 != 0) {
/* 186 */         localArrayList1.add(localfq1);
/* 187 */         n = 0;
/* 188 */         localfq1 = new fq("");
/*     */       }
/*     */     }
/*     */     
/* 192 */     localArrayList1.add(localfq1);
/*     */     
/* 194 */     boolean bool = e();
/* 195 */     for (Object localObject1 = localArrayList1.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (fj)((Iterator)localObject1).next();
/* 196 */       if ((bool) && (this.j > 0)) {
/* 197 */         this.k = true;
/* 198 */         b(1);
/*     */       }
/*     */       
/* 201 */       this.i.add(0, new bak(paramInt2, (fj)localObject2, paramInt1));
/*     */     }
/*     */     
/* 204 */     while (this.i.size() > 100) {
/* 205 */       this.i.remove(this.i.size() - 1);
/*     */     }
/*     */     
/* 208 */     if (!paramBoolean) {
/* 209 */       this.h.add(0, new bak(paramInt2, paramfj, paramInt1));
/*     */       
/* 211 */       while (this.h.size() > 100) {
/* 212 */         this.h.remove(this.h.size() - 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 218 */     this.i.clear();
/* 219 */     d();
/*     */     
/* 221 */     for (int m = this.h.size() - 1; m >= 0; m--) {
/* 222 */       bak localbak = (bak)this.h.get(m);
/* 223 */       a(localbak.a(), localbak.c(), localbak.b(), true);
/*     */     }
/*     */   }
/*     */   
/*     */   public List c() {
/* 228 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 232 */     if ((this.g.isEmpty()) || (!((String)this.g.get(this.g.size() - 1)).equals(paramString))) {
/* 233 */       this.g.add(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 238 */     this.j = 0;
/* 239 */     this.k = false;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 243 */     this.j += paramInt;
/* 244 */     int m = this.i.size();
/*     */     
/* 246 */     if (this.j > m - i()) { this.j = (m - i());
/*     */     }
/* 248 */     if (this.j <= 0) {
/* 249 */       this.j = 0;
/* 250 */       this.k = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public fj a(int paramInt1, int paramInt2) {
/* 255 */     if (!e()) return null;
/* 256 */     bca localbca = new bca(this.f, this.f.d, this.f.e);
/*     */     
/* 258 */     int m = localbca.e();
/* 259 */     float f1 = h();
/* 260 */     int n = paramInt1 / m - 3;
/* 261 */     int i1 = paramInt2 / m - 27;
/* 262 */     n = qh.d(n / f1);
/* 263 */     i1 = qh.d(i1 / f1);
/*     */     
/* 265 */     if ((n < 0) || (i1 < 0)) return null;
/* 266 */     int i2 = Math.min(i(), this.i.size());
/*     */     
/* 268 */     if ((n <= qh.d(f() / h())) && (i1 < this.f.l.a * i2 + i2)) {
/* 269 */       int i3 = i1 / this.f.l.a + this.j;
/* 270 */       int i4; if ((i3 >= 0) && (i3 < this.i.size())) {
/* 271 */         bak localbak = (bak)this.i.get(i3);
/* 272 */         i4 = 0;
/*     */         
/* 274 */         for (fj localfj : localbak.a()) {
/* 275 */           if ((localfj instanceof fq)) {
/* 276 */             i4 += this.f.l.a(b(((fq)localfj).g()));
/*     */             
/* 278 */             if (i4 > n) {
/* 279 */               return localfj;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 285 */       return null;
/*     */     }
/*     */     
/* 288 */     return null;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 292 */     return this.f.n instanceof bct;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 296 */     Iterator localIterator = this.i.iterator();
/*     */     bak localbak;
/* 298 */     while (localIterator.hasNext()) {
/* 299 */       localbak = (bak)localIterator.next();
/*     */       
/* 301 */       if (localbak.c() == paramInt) {
/* 302 */         localIterator.remove();
/*     */       }
/*     */     }
/*     */     
/* 306 */     localIterator = this.h.iterator();
/*     */     
/* 308 */     while (localIterator.hasNext()) {
/* 309 */       localbak = (bak)localIterator.next();
/*     */       
/* 311 */       if (localbak.c() == paramInt) {
/* 312 */         localIterator.remove();
/* 313 */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public int f() {
/* 319 */     return a(this.f.u.D);
/*     */   }
/*     */   
/*     */   public int g() {
/* 323 */     return b(e() ? this.f.u.F : this.f.u.E);
/*     */   }
/*     */   
/*     */   public float h() {
/* 327 */     return this.f.u.C;
/*     */   }
/*     */   
/*     */   public static int a(float paramFloat) {
/* 331 */     int m = 320;
/* 332 */     int n = 40;
/* 333 */     return qh.d(paramFloat * (m - n) + n);
/*     */   }
/*     */   
/*     */   public static int b(float paramFloat) {
/* 337 */     int m = 180;
/* 338 */     int n = 20;
/* 339 */     return qh.d(paramFloat * (m - n) + n);
/*     */   }
/*     */   
/*     */   public int i() {
/* 343 */     return g() / 9;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */