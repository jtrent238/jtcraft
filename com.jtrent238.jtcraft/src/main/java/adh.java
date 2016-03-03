/*     */ import com.google.common.collect.HashMultiset;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Multiset;
/*     */ import com.google.common.collect.Multisets;
/*     */ import java.util.List;
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
/*     */ public class adh
/*     */   extends abs
/*     */ {
/*     */   protected adh()
/*     */   {
/*  26 */     a(true);
/*     */   }
/*     */   
/*     */   public static ayi a(int paramInt, ahb paramahb) {
/*  30 */     String str = "map_" + paramInt;
/*  31 */     ayi localayi = (ayi)paramahb.a(ayi.class, str);
/*     */     
/*  33 */     if (localayi == null) {
/*  34 */       localayi = new ayi(str);
/*     */       
/*  36 */       paramahb.a(str, localayi);
/*     */     }
/*     */     
/*  39 */     return localayi;
/*     */   }
/*     */   
/*     */   public ayi a(add paramadd, ahb paramahb) {
/*  43 */     String str = "map_" + paramadd.k();
/*  44 */     ayi localayi = (ayi)paramahb.a(ayi.class, str);
/*     */     
/*  46 */     if ((localayi == null) && (!paramahb.E)) {
/*  47 */       paramadd.b(paramahb.b("map"));
/*  48 */       str = "map_" + paramadd.k();
/*  49 */       localayi = new ayi(str);
/*     */       
/*  51 */       localayi.d = 3;
/*  52 */       int i = 128 * (1 << localayi.d);
/*  53 */       localayi.a = (Math.round(paramahb.N().c() / i) * i);
/*  54 */       localayi.b = (Math.round(paramahb.N().e() / i) * i);
/*  55 */       localayi.c = ((byte)paramahb.t.i);
/*     */       
/*  57 */       localayi.c();
/*     */       
/*  59 */       paramahb.a(str, localayi);
/*     */     }
/*     */     
/*  62 */     return localayi;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, sa paramsa, ayi paramayi) {
/*  66 */     if ((paramahb.t.i != paramayi.c) || (!(paramsa instanceof yz)))
/*     */     {
/*  68 */       return;
/*     */     }
/*     */     
/*  71 */     int i = 1 << paramayi.d;
/*  72 */     int j = paramayi.a;
/*  73 */     int k = paramayi.b;
/*     */     
/*  75 */     int m = qh.c(paramsa.s - j) / i + 64;
/*  76 */     int n = qh.c(paramsa.u - k) / i + 64;
/*  77 */     int i1 = 128 / i;
/*     */     
/*  79 */     if (paramahb.t.g) {
/*  80 */       i1 /= 2;
/*     */     }
/*     */     
/*  83 */     ayj localayj = paramayi.a((yz)paramsa);
/*  84 */     localayj.d += 1;
/*     */     
/*  86 */     for (int i2 = m - i1 + 1; i2 < m + i1; i2++) {
/*  87 */       if ((i2 & 0xF) == (localayj.d & 0xF))
/*     */       {
/*  89 */         int i3 = 255;
/*  90 */         int i4 = 0;
/*     */         
/*  92 */         double d1 = 0.0D;
/*  93 */         for (int i5 = n - i1 - 1; i5 < n + i1; i5++)
/*  94 */           if ((i2 >= 0) && (i5 >= -1) && (i2 < 128) && (i5 < 128))
/*     */           {
/*  96 */             int i6 = i2 - m;
/*  97 */             int i7 = i5 - n;
/*     */             
/*  99 */             int i8 = i6 * i6 + i7 * i7 > (i1 - 2) * (i1 - 2) ? 1 : 0;
/*     */             
/* 101 */             int i9 = (j / i + i2 - 64) * i;
/* 102 */             int i10 = (k / i + i5 - 64) * i;
/*     */             
/* 104 */             HashMultiset localHashMultiset = HashMultiset.create();
/*     */             
/* 106 */             apx localapx = paramahb.d(i9, i10);
/* 107 */             if (!localapx.g()) {
/* 108 */               int i11 = i9 & 0xF;
/* 109 */               int i12 = i10 & 0xF;
/* 110 */               int i13 = 0;
/*     */               
/* 112 */               double d2 = 0.0D;
/* 113 */               int i14; int i17; int i18; if (paramahb.t.g) {
/* 114 */                 i14 = i9 + i10 * 231871;
/* 115 */                 i14 = i14 * i14 * 31287121 + i14 * 11;
/*     */                 
/* 117 */                 if ((i14 >> 20 & 0x1) == 0) {
/* 118 */                   localHashMultiset.add(ajn.d.f(0), 10);
/*     */                 } else {
/* 120 */                   localHashMultiset.add(ajn.b.f(0), 100);
/*     */                 }
/*     */                 
/* 123 */                 d2 = 100.0D;
/*     */               } else {
/* 125 */                 for (i14 = 0; i14 < i; i14++) {
/* 126 */                   for (int i15 = 0; i15 < i; i15++) {
/* 127 */                     i16 = localapx.b(i14 + i11, i15 + i12) + 1;
/* 128 */                     localObject = ajn.a;
/* 129 */                     i17 = 0;
/*     */                     
/* 131 */                     if (i16 > 1) {
/*     */                       do {
/* 133 */                         i16--;
/* 134 */                         localObject = localapx.a(i14 + i11, i16, i15 + i12);
/* 135 */                         i17 = localapx.c(i14 + i11, i16, i15 + i12);
/* 136 */                       } while ((((aji)localObject).f(i17) == awv.b) && (i16 > 0));
/*     */                       
/* 138 */                       if ((i16 > 0) && (((aji)localObject).o().d())) {
/* 139 */                         i18 = i16 - 1;
/*     */                         aji localaji;
/*     */                         do {
/* 142 */                           localaji = localapx.a(i14 + i11, i18--, i15 + i12);
/* 143 */                           i13++;
/* 144 */                         } while ((i18 > 0) && (localaji.o().d()));
/*     */                       }
/*     */                     }
/*     */                     
/* 148 */                     d2 += i16 / (i * i);
/*     */                     
/* 150 */                     localHashMultiset.add(((aji)localObject).f(i17));
/*     */                   }
/*     */                 }
/*     */               }
/* 154 */               i13 /= i * i;
/*     */               
/* 156 */               double d3 = (d2 - d1) * 4.0D / (i + 4) + ((i2 + i5 & 0x1) - 0.5D) * 0.4D;
/* 157 */               int i16 = 1;
/* 158 */               if (d3 > 0.6D) i16 = 2;
/* 159 */               if (d3 < -0.6D) { i16 = 0;
/*     */               }
/* 161 */               Object localObject = (awv)Iterables.getFirst(Multisets.copyHighestCountFirst(localHashMultiset), awv.b);
/*     */               
/* 163 */               if (localObject == awv.n) {
/* 164 */                 d3 = i13 * 0.1D + (i2 + i5 & 0x1) * 0.2D;
/* 165 */                 i16 = 1;
/* 166 */                 if (d3 < 0.5D) i16 = 2;
/* 167 */                 if (d3 > 0.9D) { i16 = 0;
/*     */                 }
/*     */               }
/* 170 */               d1 = d2;
/*     */               
/* 172 */               if ((i5 >= 0) && 
/* 173 */                 (i6 * i6 + i7 * i7 < i1 * i1) && (
/* 174 */                 (i8 == 0) || ((i2 + i5 & 0x1) != 0)))
/*     */               {
/*     */ 
/* 177 */                 i17 = paramayi.e[(i2 + i5 * 128)];
/* 178 */                 i18 = (byte)(((awv)localObject).M * 4 + i16);
/* 179 */                 if (i17 != i18) {
/* 180 */                   if (i3 > i5) i3 = i5;
/* 181 */                   if (i4 < i5) i4 = i5;
/* 182 */                   paramayi.e[(i2 + i5 * 128)] = i18;
/*     */                 }
/*     */               }
/*     */             } }
/* 186 */         if (i3 <= i4) {
/* 187 */           paramayi.a(i2, i3, i4);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(add paramadd, ahb paramahb, sa paramsa, int paramInt, boolean paramBoolean) {
/* 194 */     if (paramahb.E) { return;
/*     */     }
/* 196 */     ayi localayi = a(paramadd, paramahb);
/* 197 */     if ((paramsa instanceof yz)) {
/* 198 */       yz localyz = (yz)paramsa;
/* 199 */       localayi.a(localyz, paramadd);
/*     */     }
/*     */     
/* 202 */     if (paramBoolean) {
/* 203 */       a(paramahb, paramsa, localayi);
/*     */     }
/*     */   }
/*     */   
/*     */   public ft c(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/* 209 */     byte[] arrayOfByte = a(paramadd, paramahb).a(paramadd, paramahb, paramyz);
/* 210 */     if (arrayOfByte == null) return null;
/* 211 */     return new he(paramadd.k(), arrayOfByte);
/*     */   }
/*     */   
/*     */   public void d(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/* 216 */     if ((paramadd.p()) && (paramadd.q().n("map_is_scaling"))) {
/* 217 */       ayi localayi1 = ade.aY.a(paramadd, paramahb);
/* 218 */       paramadd.b(paramahb.b("map"));
/* 219 */       ayi localayi2 = new ayi("map_" + paramadd.k());
/*     */       
/* 221 */       localayi2.d = ((byte)(localayi1.d + 1));
/* 222 */       if (localayi2.d > 4) localayi2.d = 4;
/* 223 */       localayi2.a = localayi1.a;
/* 224 */       localayi2.b = localayi1.b;
/* 225 */       localayi2.c = localayi1.c;
/* 226 */       localayi2.c();
/* 227 */       paramahb.a("map_" + paramadd.k(), localayi2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*     */   {
/* 233 */     ayi localayi = a(paramadd, paramyz.o);
/*     */     
/* 235 */     if (paramBoolean) {
/* 236 */       if (localayi == null) {
/* 237 */         paramList.add("Unknown map");
/*     */       } else {
/* 239 */         paramList.add("Scaling at 1:" + (1 << localayi.d));
/* 240 */         paramList.add("(Level " + localayi.d + "/" + 4 + ")");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */