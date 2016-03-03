/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aau
/*    */   extends aay
/*    */ {
/*    */   private final aas a;
/*    */   private yz b;
/*    */   private int c;
/*    */   private final agm d;
/*    */   
/*    */   public aau(yz paramyz, agm paramagm, aas paramaas, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     super(paramaas, paramInt1, paramInt2, paramInt3);
/* 16 */     this.b = paramyz;
/* 17 */     this.d = paramagm;
/* 18 */     this.a = paramaas;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd)
/*    */   {
/* 23 */     return false;
/*    */   }
/*    */   
/*    */   public add a(int paramInt)
/*    */   {
/* 28 */     if (e()) {
/* 29 */       this.c += Math.min(paramInt, d().b);
/*    */     }
/* 31 */     return super.a(paramInt);
/*    */   }
/*    */   
/*    */   protected void a(add paramadd, int paramInt)
/*    */   {
/* 36 */     this.c += paramInt;
/* 37 */     b(paramadd);
/*    */   }
/*    */   
/*    */   protected void b(add paramadd)
/*    */   {
/* 42 */     paramadd.a(this.b.o, this.b, this.c);
/* 43 */     this.c = 0;
/*    */   }
/*    */   
/*    */   public void a(yz paramyz, add paramadd)
/*    */   {
/* 48 */     b(paramadd);
/*    */     
/* 50 */     agn localagn = this.a.i();
/* 51 */     if (localagn != null)
/*    */     {
/* 53 */       add localadd1 = this.a.a(0);
/* 54 */       add localadd2 = this.a.a(1);
/*    */       
/*    */ 
/* 57 */       if ((a(localagn, localadd1, localadd2)) || (a(localagn, localadd2, localadd1))) {
/* 58 */         this.d.a(localagn);
/*    */         
/* 60 */         if ((localadd1 != null) && (localadd1.b <= 0)) {
/* 61 */           localadd1 = null;
/*    */         }
/* 63 */         if ((localadd2 != null) && (localadd2.b <= 0)) {
/* 64 */           localadd2 = null;
/*    */         }
/* 66 */         this.a.a(0, localadd1);
/* 67 */         this.a.a(1, localadd2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean a(agn paramagn, add paramadd1, add paramadd2) {
/* 73 */     add localadd1 = paramagn.a();
/* 74 */     add localadd2 = paramagn.b();
/*    */     
/* 76 */     if ((paramadd1 != null) && (paramadd1.b() == localadd1.b())) {
/* 77 */       if ((localadd2 != null) && (paramadd2 != null) && (localadd2.b() == paramadd2.b())) {
/* 78 */         paramadd1.b -= localadd1.b;
/* 79 */         paramadd2.b -= localadd2.b;
/* 80 */         return true; }
/* 81 */       if ((localadd2 == null) && (paramadd2 == null)) {
/* 82 */         paramadd1.b -= localadd1.b;
/* 83 */         return true;
/*    */       }
/*    */     }
/* 86 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */