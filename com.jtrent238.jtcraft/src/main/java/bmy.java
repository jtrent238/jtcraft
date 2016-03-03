/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmy
/*    */ {
/* 21 */   public float[][] a = new float[16][16];
/* 22 */   public float[] b = new float[16];
/* 23 */   public float[] c = new float[16];
/* 24 */   public float[] d = new float[16];
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 70 */     for (int i = 0; i < 6; i++) {
/* 71 */       if (this.a[i][0] * paramDouble1 + this.a[i][1] * paramDouble2 + this.a[i][2] * paramDouble3 + this.a[i][3] <= 0.0D)
/*    */       {
/* 73 */         if (this.a[i][0] * paramDouble4 + this.a[i][1] * paramDouble2 + this.a[i][2] * paramDouble3 + this.a[i][3] <= 0.0D)
/*    */         {
/* 75 */           if (this.a[i][0] * paramDouble1 + this.a[i][1] * paramDouble5 + this.a[i][2] * paramDouble3 + this.a[i][3] <= 0.0D)
/*    */           {
/* 77 */             if (this.a[i][0] * paramDouble4 + this.a[i][1] * paramDouble5 + this.a[i][2] * paramDouble3 + this.a[i][3] <= 0.0D)
/*    */             {
/* 79 */               if (this.a[i][0] * paramDouble1 + this.a[i][1] * paramDouble2 + this.a[i][2] * paramDouble6 + this.a[i][3] <= 0.0D)
/*    */               {
/* 81 */                 if (this.a[i][0] * paramDouble4 + this.a[i][1] * paramDouble2 + this.a[i][2] * paramDouble6 + this.a[i][3] <= 0.0D)
/*    */                 {
/* 83 */                   if (this.a[i][0] * paramDouble1 + this.a[i][1] * paramDouble5 + this.a[i][2] * paramDouble6 + this.a[i][3] <= 0.0D)
/*    */                   {
/* 85 */                     if (this.a[i][0] * paramDouble4 + this.a[i][1] * paramDouble5 + this.a[i][2] * paramDouble6 + this.a[i][3] <= 0.0D)
/*    */                     {
/*    */ 
/* 88 */                       return false; } } } } } } }
/*    */       }
/*    */     }
/* 91 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */