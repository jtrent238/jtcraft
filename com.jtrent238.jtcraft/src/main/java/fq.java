/*    */ public class fq extends fe
/*    */ {
/*    */   private final String b;
/*    */   
/*    */   public fq(String paramString)
/*    */   {
/*  7 */     this.b = paramString;
/*    */   }
/*    */   
/*    */   public String g() {
/* 11 */     return this.b;
/*    */   }
/*    */   
/*    */   public String e()
/*    */   {
/* 16 */     return this.b;
/*    */   }
/*    */   
/*    */   public fq h()
/*    */   {
/* 21 */     fq localfq = new fq(this.b);
/* 22 */     localfq.a(b().l());
/* 23 */     for (fj localfj : a()) {
/* 24 */       localfq.a(localfj.f());
/*    */     }
/* 26 */     return localfq;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 31 */     if (this == paramObject) { return true;
/*    */     }
/* 33 */     if ((paramObject instanceof fq)) {
/* 34 */       fq localfq = (fq)paramObject;
/* 35 */       return (this.b.equals(localfq.g())) && (super.equals(paramObject));
/*    */     }
/*    */     
/* 38 */     return false;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 43 */     return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + b() + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */