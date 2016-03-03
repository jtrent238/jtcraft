/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class go
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private add[] b;
/*    */   
/*    */   public go() {}
/*    */   
/*    */   public go(int paramInt, List paramList)
/*    */   {
/* 20 */     this.a = paramInt;
/* 21 */     this.b = new add[paramList.size()];
/* 22 */     for (int i = 0; i < this.b.length; i++) {
/* 23 */       add localadd = (add)paramList.get(i);
/* 24 */       this.b[i] = (localadd == null ? null : localadd.m());
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 30 */     this.a = paramet.readUnsignedByte();
/* 31 */     int i = paramet.readShort();
/* 32 */     this.b = new add[i];
/* 33 */     for (int j = 0; j < i; j++) {
/* 34 */       this.b[j] = paramet.c();
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 40 */     paramet.writeByte(this.a);
/* 41 */     paramet.writeShort(this.b.length);
/* 42 */     for (add localadd : this.b) {
/* 43 */       paramet.a(localadd);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 49 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 53 */     return this.a;
/*    */   }
/*    */   
/*    */   public add[] d() {
/* 57 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */