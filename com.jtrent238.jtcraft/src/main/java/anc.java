/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class anc
/*     */   extends aoc
/*     */ {
/*     */   private boolean a;
/*  27 */   private static Map b = new HashMap();
/*     */   
/*     */   private boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  30 */     if (!b.containsKey(paramahb)) { b.put(paramahb, new ArrayList());
/*     */     }
/*  32 */     List localList = (List)b.get(paramahb);
/*  33 */     if (paramBoolean) localList.add(new and(paramInt1, paramInt2, paramInt3, paramahb.I()));
/*  34 */     int i = 0;
/*  35 */     for (int j = 0; j < localList.size(); j++) {
/*  36 */       and localand = (and)localList.get(j);
/*  37 */       if ((localand.a == paramInt1) && (localand.b == paramInt2) && (localand.c == paramInt3)) {
/*  38 */         i++;
/*  39 */         if (i >= 8) {
/*  40 */           return true;
/*     */         }
/*     */       }
/*     */     }
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   protected anc(boolean paramBoolean) {
/*  48 */     this.a = paramBoolean;
/*  49 */     a(true);
/*  50 */     a(null);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  55 */     return 2;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  60 */     if (paramahb.e(paramInt1, paramInt2, paramInt3) == 0) super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  61 */     if (this.a) {
/*  62 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*  63 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*  64 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/*  65 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/*  66 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/*  67 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/*  73 */     if (this.a) {
/*  74 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*  75 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*  76 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/*  77 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/*  78 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/*  79 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  85 */     if (!this.a) { return 0;
/*     */     }
/*  87 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  89 */     if ((i == 5) && (paramInt4 == 1)) return 0;
/*  90 */     if ((i == 3) && (paramInt4 == 3)) return 0;
/*  91 */     if ((i == 4) && (paramInt4 == 2)) return 0;
/*  92 */     if ((i == 1) && (paramInt4 == 5)) return 0;
/*  93 */     if ((i == 2) && (paramInt4 == 4)) { return 0;
/*     */     }
/*  95 */     return 15;
/*     */   }
/*     */   
/*     */   private boolean m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  99 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 101 */     if ((i == 5) && (paramahb.f(paramInt1, paramInt2 - 1, paramInt3, 0))) return true;
/* 102 */     if ((i == 3) && (paramahb.f(paramInt1, paramInt2, paramInt3 - 1, 2))) return true;
/* 103 */     if ((i == 4) && (paramahb.f(paramInt1, paramInt2, paramInt3 + 1, 3))) return true;
/* 104 */     if ((i == 1) && (paramahb.f(paramInt1 - 1, paramInt2, paramInt3, 4))) return true;
/* 105 */     if ((i == 2) && (paramahb.f(paramInt1 + 1, paramInt2, paramInt3, 5))) return true;
/* 106 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 111 */     boolean bool = m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/* 113 */     List localList = (List)b.get(paramahb);
/* 114 */     while ((localList != null) && (!localList.isEmpty()) && (paramahb.I() - ((and)localList.get(0)).d > 60L)) {
/* 115 */       localList.remove(0);
/*     */     }
/*     */     
/* 118 */     if (this.a) {
/* 119 */       if (bool) {
/* 120 */         paramahb.d(paramInt1, paramInt2, paramInt3, ajn.az, paramahb.e(paramInt1, paramInt2, paramInt3), 3);
/*     */         
/* 122 */         if (a(paramahb, paramInt1, paramInt2, paramInt3, true)) {
/* 123 */           paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, "random.fizz", 0.5F, 2.6F + (paramahb.s.nextFloat() - paramahb.s.nextFloat()) * 0.8F);
/* 124 */           for (int i = 0; i < 5; i++) {
/* 125 */             double d1 = paramInt1 + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 126 */             double d2 = paramInt2 + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 127 */             double d3 = paramInt3 + paramRandom.nextDouble() * 0.6D + 0.2D;
/*     */             
/* 129 */             paramahb.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 134 */     else if ((!bool) && 
/* 135 */       (!a(paramahb, paramInt1, paramInt2, paramInt3, false))) {
/* 136 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.aA, paramahb.e(paramInt1, paramInt2, paramInt3), 3);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 144 */     if (b(paramahb, paramInt1, paramInt2, paramInt3, paramaji)) {
/* 145 */       return;
/*     */     }
/*     */     
/* 148 */     boolean bool = m(paramahb, paramInt1, paramInt2, paramInt3);
/* 149 */     if (((this.a) && (bool)) || ((!this.a) && (!bool))) {
/* 150 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     }
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 156 */     if (paramInt4 == 0) {
/* 157 */       return b(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/* 159 */     return 0;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 164 */     return adb.a(ajn.aA);
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 169 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 174 */     if (!this.a) return;
/* 175 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 176 */     double d1 = paramInt1 + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 177 */     double d2 = paramInt2 + 0.7F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 178 */     double d3 = paramInt3 + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 179 */     double d4 = 0.2199999988079071D;
/* 180 */     double d5 = 0.27000001072883606D;
/* 181 */     if (i == 1) {
/* 182 */       paramahb.a("reddust", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 183 */     } else if (i == 2) {
/* 184 */       paramahb.a("reddust", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 185 */     } else if (i == 3) {
/* 186 */       paramahb.a("reddust", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
/* 187 */     } else if (i == 4) {
/* 188 */       paramahb.a("reddust", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
/*     */     } else {
/* 190 */       paramahb.a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 196 */     return adb.a(ajn.aA);
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
/*     */   public boolean c(aji paramaji)
/*     */   {
/* 212 */     return (paramaji == ajn.az) || (paramaji == ajn.aA);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */