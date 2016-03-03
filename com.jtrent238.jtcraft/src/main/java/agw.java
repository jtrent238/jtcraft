/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agw
/*     */ {
/*     */   public boolean a;
/*  19 */   public boolean b = true;
/*  20 */   private int i = 16;
/*  21 */   private Random j = new Random();
/*     */   private ahb k;
/*     */   public double c;
/*     */   public double d;
/*     */   public double e;
/*  26 */   public sa f; public float g; public List h = new ArrayList();
/*  27 */   private Map l = new HashMap();
/*     */   
/*     */   public agw(ahb paramahb, sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  30 */     this.k = paramahb;
/*  31 */     this.f = paramsa;
/*  32 */     this.g = paramFloat;
/*  33 */     this.c = paramDouble1;
/*  34 */     this.d = paramDouble2;
/*  35 */     this.e = paramDouble3;
/*     */   }
/*     */   
/*     */   public void a() {
/*  39 */     float f1 = this.g;
/*     */     
/*  41 */     HashSet localHashSet = new HashSet();
/*     */     double d6;
/*  43 */     double d7; double d8; for (int m = 0; m < this.i; m++) {
/*  44 */       for (n = 0; n < this.i; n++) {
/*  45 */         for (i1 = 0; i1 < this.i; i1++) {
/*  46 */           if ((m == 0) || (m == this.i - 1) || (n == 0) || (n == this.i - 1) || (i1 == 0) || (i1 == this.i - 1))
/*     */           {
/*  48 */             double d1 = m / (this.i - 1.0F) * 2.0F - 1.0F;
/*  49 */             double d2 = n / (this.i - 1.0F) * 2.0F - 1.0F;
/*  50 */             double d3 = i1 / (this.i - 1.0F) * 2.0F - 1.0F;
/*  51 */             double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*     */             
/*  53 */             d1 /= d4;
/*  54 */             d2 /= d4;
/*  55 */             d3 /= d4;
/*     */             
/*  57 */             float f2 = this.g * (0.7F + this.k.s.nextFloat() * 0.6F);
/*  58 */             d6 = this.c;
/*  59 */             d7 = this.d;
/*  60 */             d8 = this.e;
/*     */             
/*  62 */             float f3 = 0.3F;
/*  63 */             while (f2 > 0.0F) {
/*  64 */               int i6 = qh.c(d6);
/*  65 */               int i7 = qh.c(d7);
/*  66 */               int i8 = qh.c(d8);
/*     */               
/*  68 */               aji localaji = this.k.a(i6, i7, i8);
/*  69 */               if (localaji.o() != awt.a) {
/*  70 */                 float f4 = this.f != null ? this.f.a(this, this.k, i6, i7, i8, localaji) : localaji.a(this.f);
/*  71 */                 f2 -= (f4 + 0.3F) * f3;
/*     */               }
/*     */               
/*  74 */               if ((f2 > 0.0F) && ((this.f == null) || (this.f.a(this, this.k, i6, i7, i8, localaji, f2)))) {
/*  75 */                 localHashSet.add(new agt(i6, i7, i8));
/*     */               }
/*     */               
/*  78 */               d6 += d1 * f3;
/*  79 */               d7 += d2 * f3;
/*  80 */               d8 += d3 * f3;
/*  81 */               f2 -= f3 * 0.75F;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  87 */     this.h.addAll(localHashSet);
/*     */     
/*  89 */     this.g *= 2.0F;
/*  90 */     m = qh.c(this.c - this.g - 1.0D);
/*  91 */     int n = qh.c(this.c + this.g + 1.0D);
/*  92 */     int i1 = qh.c(this.d - this.g - 1.0D);
/*  93 */     int i2 = qh.c(this.d + this.g + 1.0D);
/*  94 */     int i3 = qh.c(this.e - this.g - 1.0D);
/*  95 */     int i4 = qh.c(this.e + this.g + 1.0D);
/*  96 */     List localList = this.k.b(this.f, azt.a(m, i1, i3, n, i2, i4));
/*  97 */     azw localazw = azw.a(this.c, this.d, this.e);
/*     */     
/*  99 */     for (int i5 = 0; i5 < localList.size(); i5++) {
/* 100 */       sa localsa = (sa)localList.get(i5);
/* 101 */       double d5 = localsa.f(this.c, this.d, this.e) / this.g;
/*     */       
/* 103 */       if (d5 <= 1.0D) {
/* 104 */         d6 = localsa.s - this.c;
/* 105 */         d7 = localsa.t + localsa.g() - this.d;
/* 106 */         d8 = localsa.u - this.e;
/*     */         
/* 108 */         double d9 = qh.a(d6 * d6 + d7 * d7 + d8 * d8);
/* 109 */         if (d9 != 0.0D)
/*     */         {
/* 111 */           d6 /= d9;
/* 112 */           d7 /= d9;
/* 113 */           d8 /= d9;
/*     */           
/* 115 */           double d10 = this.k.a(localazw, localsa.C);
/* 116 */           double d11 = (1.0D - d5) * d10;
/* 117 */           localsa.a(ro.a(this), (int)((d11 * d11 + d11) / 2.0D * 8.0D * this.g + 1.0D));
/*     */           
/* 119 */           double d12 = agi.a(localsa, d11);
/* 120 */           localsa.v += d6 * d12;
/* 121 */           localsa.w += d7 * d12;
/* 122 */           localsa.x += d8 * d12;
/*     */           
/* 124 */           if ((localsa instanceof yz)) {
/* 125 */             this.l.put((yz)localsa, azw.a(d6 * d11, d7 * d11, d8 * d11));
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 130 */     this.g = f1;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 134 */     this.k.a(this.c, this.d, this.e, "random.explode", 4.0F, (1.0F + (this.k.s.nextFloat() - this.k.s.nextFloat()) * 0.2F) * 0.7F);
/* 135 */     if ((this.g < 2.0F) || (!this.b)) {
/* 136 */       this.k.a("largeexplode", this.c, this.d, this.e, 1.0D, 0.0D, 0.0D);
/*     */     } else {
/* 138 */       this.k.a("hugeexplosion", this.c, this.d, this.e, 1.0D, 0.0D, 0.0D);
/*     */     }
/*     */     Iterator localIterator;
/* 141 */     if (this.b)
/* 142 */       for (localIterator = this.h.iterator(); localIterator.hasNext();) { localagt = (agt)localIterator.next();
/* 143 */         m = localagt.a;
/* 144 */         n = localagt.b;
/* 145 */         i1 = localagt.c;
/*     */         
/* 147 */         localaji1 = this.k.a(m, n, i1);
/*     */         
/* 149 */         if (paramBoolean) {
/* 150 */           double d1 = m + this.k.s.nextFloat();
/* 151 */           double d2 = n + this.k.s.nextFloat();
/* 152 */           double d3 = i1 + this.k.s.nextFloat();
/*     */           
/* 154 */           double d4 = d1 - this.c;
/* 155 */           double d5 = d2 - this.d;
/* 156 */           double d6 = d3 - this.e;
/*     */           
/* 158 */           double d7 = qh.a(d4 * d4 + d5 * d5 + d6 * d6);
/*     */           
/* 160 */           d4 /= d7;
/* 161 */           d5 /= d7;
/* 162 */           d6 /= d7;
/*     */           
/* 164 */           double d8 = 0.5D / (d7 / this.g + 0.1D);
/* 165 */           d8 *= (this.k.s.nextFloat() * this.k.s.nextFloat() + 0.3F);
/* 166 */           d4 *= d8;
/* 167 */           d5 *= d8;
/* 168 */           d6 *= d8;
/*     */           
/* 170 */           this.k.a("explode", (d1 + this.c * 1.0D) / 2.0D, (d2 + this.d * 1.0D) / 2.0D, (d3 + this.e * 1.0D) / 2.0D, d4, d5, d6);
/* 171 */           this.k.a("smoke", d1, d2, d3, d4, d5, d6);
/*     */         }
/*     */         
/* 174 */         if (localaji1.o() != awt.a) {
/* 175 */           if (localaji1.a(this)) {
/* 176 */             localaji1.a(this.k, m, n, i1, this.k.e(m, n, i1), 1.0F / this.g, 0);
/*     */           }
/* 178 */           this.k.d(m, n, i1, ajn.a, 0, 3);
/* 179 */           localaji1.a(this.k, m, n, i1, this); } }
/*     */     agt localagt;
/*     */     int m;
/*     */     int n;
/* 183 */     int i1; aji localaji1; if (this.a) {
/* 184 */       for (localIterator = this.h.iterator(); localIterator.hasNext();) { localagt = (agt)localIterator.next();
/* 185 */         m = localagt.a;
/* 186 */         n = localagt.b;
/* 187 */         i1 = localagt.c;
/*     */         
/* 189 */         localaji1 = this.k.a(m, n, i1);
/* 190 */         aji localaji2 = this.k.a(m, n - 1, i1);
/* 191 */         if ((localaji1.o() == awt.a) && (localaji2.j()) && (this.j.nextInt(3) == 0)) {
/* 192 */           this.k.b(m, n, i1, ajn.ab);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public Map b() {
/* 199 */     return this.l;
/*     */   }
/*     */   
/*     */   public sv c() {
/* 203 */     if (this.f == null) return null;
/* 204 */     if ((this.f instanceof xw)) return ((xw)this.f).e();
/* 205 */     if ((this.f instanceof sv)) return (sv)this.f;
/* 206 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */