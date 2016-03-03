/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ abstract class ats
/*     */   extends avk
/*     */ {
/* 123 */   protected static final qx[] a = { new qx(ade.i, 0, 1, 3, 5), new qx(ade.j, 0, 1, 5, 5), new qx(ade.k, 0, 1, 3, 15), new qx(ade.B, 0, 1, 1, 5), new qx(ade.ah, 0, 1, 1, 5), new qx(ade.d, 0, 1, 1, 5), new qx(ade.bm, 0, 3, 7, 5), new qx(ade.av, 0, 1, 1, 10), new qx(ade.bY, 0, 1, 1, 8), new qx(ade.bX, 0, 1, 1, 5), new qx(ade.bZ, 0, 1, 1, 3) };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ats() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected ats(int paramInt)
/*     */   {
/* 143 */     super(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(dh paramdh) {}
/*     */   
/*     */ 
/*     */   protected void a(dh paramdh) {}
/*     */   
/*     */ 
/*     */   private int a(List paramList)
/*     */   {
/* 155 */     int i = 0;
/* 156 */     int j = 0;
/* 157 */     for (att localatt : paramList) {
/* 158 */       if ((localatt.d > 0) && (localatt.c < localatt.d)) {
/* 159 */         i = 1;
/*     */       }
/* 161 */       j += localatt.b;
/*     */     }
/* 163 */     return i != 0 ? j : -1;
/*     */   }
/*     */   
/*     */ 
/*     */   private ats a(atw paramatw, List paramList1, List paramList2, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 169 */     int i = a(paramList1);
/* 170 */     int j = (i > 0) && (paramInt5 <= 30) ? 1 : 0;
/*     */     
/* 172 */     int k = 0;
/* 173 */     int m; while ((k < 5) && (j != 0)) {
/* 174 */       k++;
/*     */       
/* 176 */       m = paramRandom.nextInt(i);
/* 177 */       for (att localatt : paramList1) {
/* 178 */         m -= localatt.b;
/* 179 */         if (m < 0)
/*     */         {
/* 181 */           if ((!localatt.a(paramInt5)) || ((localatt == paramatw.b) && (!localatt.e))) {
/*     */             break;
/*     */           }
/*     */           
/* 185 */           ats localats = atf.a(localatt, paramList2, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 186 */           if (localats != null) {
/* 187 */             localatt.c += 1;
/* 188 */             paramatw.b = localatt;
/*     */             
/* 190 */             if (!localatt.a()) {
/* 191 */               paramList1.remove(localatt);
/*     */             }
/* 193 */             return localats;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 198 */     return ath.a(paramList2, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */   }
/*     */   
/*     */   private avk a(atw paramatw, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
/* 202 */     if ((Math.abs(paramInt1 - paramatw.c().a) > 112) || (Math.abs(paramInt3 - paramatw.c().c) > 112)) {
/* 203 */       return ath.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*     */     }
/* 205 */     List localList = paramatw.c;
/* 206 */     if (paramBoolean) {
/* 207 */       localList = paramatw.d;
/*     */     }
/* 209 */     ats localats = a(paramatw, localList, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5 + 1);
/* 210 */     if (localats != null) {
/* 211 */       paramList.add(localats);
/* 212 */       paramatw.e.add(localats);
/*     */     }
/* 214 */     return localats;
/*     */   }
/*     */   
/*     */   protected avk a(atw paramatw, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 218 */     switch (this.g) {
/*     */     case 2: 
/* 220 */       return a(paramatw, paramList, paramRandom, this.f.a + paramInt1, this.f.b + paramInt2, this.f.c - 1, this.g, d(), paramBoolean);
/*     */     case 0: 
/* 222 */       return a(paramatw, paramList, paramRandom, this.f.a + paramInt1, this.f.b + paramInt2, this.f.f + 1, this.g, d(), paramBoolean);
/*     */     case 1: 
/* 224 */       return a(paramatw, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt2, this.f.c + paramInt1, this.g, d(), paramBoolean);
/*     */     case 3: 
/* 226 */       return a(paramatw, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt2, this.f.c + paramInt1, this.g, d(), paramBoolean);
/*     */     }
/* 228 */     return null;
/*     */   }
/*     */   
/*     */   protected avk b(atw paramatw, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 232 */     switch (this.g) {
/*     */     case 2: 
/* 234 */       return a(paramatw, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt1, this.f.c + paramInt2, 1, d(), paramBoolean);
/*     */     case 0: 
/* 236 */       return a(paramatw, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt1, this.f.c + paramInt2, 1, d(), paramBoolean);
/*     */     case 1: 
/* 238 */       return a(paramatw, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.c - 1, 2, d(), paramBoolean);
/*     */     case 3: 
/* 240 */       return a(paramatw, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.c - 1, 2, d(), paramBoolean);
/*     */     }
/* 242 */     return null;
/*     */   }
/*     */   
/*     */   protected avk c(atw paramatw, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 246 */     switch (this.g) {
/*     */     case 2: 
/* 248 */       return a(paramatw, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt1, this.f.c + paramInt2, 3, d(), paramBoolean);
/*     */     case 0: 
/* 250 */       return a(paramatw, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt1, this.f.c + paramInt2, 3, d(), paramBoolean);
/*     */     case 1: 
/* 252 */       return a(paramatw, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.f + 1, 0, d(), paramBoolean);
/*     */     case 3: 
/* 254 */       return a(paramatw, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.f + 1, 0, d(), paramBoolean);
/*     */     }
/* 256 */     return null;
/*     */   }
/*     */   
/*     */   protected static boolean a(asv paramasv) {
/* 260 */     return (paramasv != null) && (paramasv.b > 10);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */