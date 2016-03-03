/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang3.tuple.ImmutablePair;
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
/*     */ public class amb
/*     */   extends aji
/*     */ {
/*  21 */   public static final String[] a = { "stone", "cobble", "brick", "mossybrick", "crackedbrick", "chiseledbrick" };
/*     */   
/*     */ 
/*     */   public amb()
/*     */   {
/*  26 */     super(awt.B);
/*     */     
/*  28 */     c(0.0F);
/*  29 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  34 */     switch (paramInt2) {
/*     */     case 1: 
/*  36 */       return ajn.e.h(paramInt1);
/*     */     case 2: 
/*  38 */       return ajn.aV.h(paramInt1);
/*     */     case 3: 
/*  40 */       return ajn.aV.a(paramInt1, 1);
/*     */     case 4: 
/*  42 */       return ajn.aV.a(paramInt1, 2);
/*     */     case 5: 
/*  44 */       return ajn.aV.a(paramInt1, 3);
/*     */     }
/*  46 */     return ajn.b.h(paramInt1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(rg paramrg) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  57 */     if (!paramahb.E) {
/*  58 */       yk localyk = new yk(paramahb);
/*  59 */       localyk.b(paramInt1 + 0.5D, paramInt2, paramInt3 + 0.5D, 0.0F, 0.0F);
/*  60 */       paramahb.d(localyk);
/*     */       
/*  62 */       localyk.s();
/*     */     }
/*  64 */     super.b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  69 */     return 0;
/*     */   }
/*     */   
/*     */   public static boolean a(aji paramaji) {
/*  73 */     return (paramaji == ajn.b) || (paramaji == ajn.e) || (paramaji == ajn.aV);
/*     */   }
/*     */   
/*     */   public static int a(aji paramaji, int paramInt) {
/*  77 */     if (paramInt == 0) {
/*  78 */       if (paramaji == ajn.e) {
/*  79 */         return 1;
/*     */       }
/*  81 */       if (paramaji == ajn.aV) {
/*  82 */         return 2;
/*     */       }
/*     */     }
/*  85 */     else if (paramaji == ajn.aV) {
/*  86 */       switch (paramInt) {
/*     */       case 1: 
/*  88 */         return 3;
/*     */       case 2: 
/*  90 */         return 4;
/*     */       case 3: 
/*  92 */         return 5;
/*     */       }
/*     */       
/*     */     }
/*  96 */     return 0;
/*     */   }
/*     */   
/*     */   public static ImmutablePair b(int paramInt) {
/* 100 */     switch (paramInt) {
/*     */     case 1: 
/* 102 */       return new ImmutablePair(ajn.e, Integer.valueOf(0));
/*     */     case 2: 
/* 104 */       return new ImmutablePair(ajn.aV, Integer.valueOf(0));
/*     */     case 3: 
/* 106 */       return new ImmutablePair(ajn.aV, Integer.valueOf(1));
/*     */     case 4: 
/* 108 */       return new ImmutablePair(ajn.aV, Integer.valueOf(2));
/*     */     case 5: 
/* 110 */       return new ImmutablePair(ajn.aV, Integer.valueOf(3));
/*     */     }
/* 112 */     return new ImmutablePair(ajn.b, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */ 
/*     */   protected add j(int paramInt)
/*     */   {
/* 118 */     switch (paramInt) {
/*     */     case 1: 
/* 120 */       return new add(ajn.e);
/*     */     case 2: 
/* 122 */       return new add(ajn.aV);
/*     */     case 3: 
/* 124 */       return new add(ajn.aV, 1, 1);
/*     */     case 4: 
/* 126 */       return new add(ajn.aV, 1, 2);
/*     */     case 5: 
/* 128 */       return new add(ajn.aV, 1, 3);
/*     */     }
/* 130 */     return new add(ajn.b);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 136 */     if (!paramahb.E) {
/* 137 */       yk localyk = new yk(paramahb);
/* 138 */       localyk.b(paramInt1 + 0.5D, paramInt2, paramInt3 + 0.5D, 0.0F, 0.0F);
/* 139 */       paramahb.d(localyk);
/*     */       
/* 141 */       localyk.s();
/*     */     }
/*     */   }
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 147 */     return paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 152 */     for (int i = 0; i < a.length; i++) {
/* 153 */       paramList.add(new add(paramadb, 1, i));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */