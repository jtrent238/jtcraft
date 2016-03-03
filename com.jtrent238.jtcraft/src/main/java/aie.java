/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ public class aie extends aib
/*     */ {
/*     */   private ahu c;
/*     */   private float d;
/*     */   
/*     */   public aie(ahu paramahu, float paramFloat)
/*     */   {
/*  12 */     this.c = paramahu;
/*  13 */     this.d = paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ahu a(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     return this.c;
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
/*     */   public ahu[] a(ahu[] paramArrayOfahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  40 */     if ((paramArrayOfahu == null) || (paramArrayOfahu.length < paramInt3 * paramInt4)) {
/*  41 */       paramArrayOfahu = new ahu[paramInt3 * paramInt4];
/*     */     }
/*     */     
/*  44 */     Arrays.fill(paramArrayOfahu, 0, paramInt3 * paramInt4, this.c);
/*     */     
/*  46 */     return paramArrayOfahu;
/*     */   }
/*     */   
/*     */   public float[] a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  51 */     if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < paramInt3 * paramInt4)) {
/*  52 */       paramArrayOfFloat = new float[paramInt3 * paramInt4];
/*     */     }
/*  54 */     Arrays.fill(paramArrayOfFloat, 0, paramInt3 * paramInt4, this.d);
/*     */     
/*  56 */     return paramArrayOfFloat;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ahu[] b(ahu[] paramArrayOfahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  80 */     if ((paramArrayOfahu == null) || (paramArrayOfahu.length < paramInt3 * paramInt4)) {
/*  81 */       paramArrayOfahu = new ahu[paramInt3 * paramInt4];
/*     */     }
/*     */     
/*  84 */     Arrays.fill(paramArrayOfahu, 0, paramInt3 * paramInt4, this.c);
/*     */     
/*  86 */     return paramArrayOfahu;
/*     */   }
/*     */   
/*     */   public ahu[] a(ahu[] paramArrayOfahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*     */   {
/*  91 */     return b(paramArrayOfahu, paramInt1, paramInt2, paramInt3, paramInt4);
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
/*     */   public agt a(int paramInt1, int paramInt2, int paramInt3, List paramList, Random paramRandom)
/*     */   {
/* 106 */     if (paramList.contains(this.c)) {
/* 107 */       return new agt(paramInt1 - paramInt3 + paramRandom.nextInt(paramInt3 * 2 + 1), 0, paramInt2 - paramInt3 + paramRandom.nextInt(paramInt3 * 2 + 1));
/*     */     }
/*     */     
/* 110 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, List paramList)
/*     */   {
/* 120 */     return paramList.contains(this.c);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */