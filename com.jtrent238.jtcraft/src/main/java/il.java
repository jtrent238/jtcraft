/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class il
/*    */   extends ft
/*    */ {
/*    */   private int a;
/* 17 */   private final List b = new ArrayList();
/*    */   
/*    */   public il() {}
/*    */   
/*    */   public il(int paramInt, Collection paramCollection)
/*    */   {
/* 23 */     this.a = paramInt;
/*    */     
/* 25 */     for (ti localti : paramCollection) {
/* 26 */       this.b.add(new im(this, localti.a().a(), localti.b(), localti.c()));
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.readInt();
/*    */     
/* 34 */     int i = paramet.readInt();
/* 35 */     for (int j = 0; j < i; j++) {
/* 36 */       String str = paramet.c(64);
/* 37 */       double d = paramet.readDouble();
/* 38 */       ArrayList localArrayList = new ArrayList();
/* 39 */       int k = paramet.readShort();
/*    */       
/* 41 */       for (int m = 0; m < k; m++) {
/* 42 */         UUID localUUID = new UUID(paramet.readLong(), paramet.readLong());
/* 43 */         localArrayList.add(new tj(localUUID, "Unknown synced attribute modifier", paramet.readDouble(), paramet.readByte()));
/*    */       }
/*    */       
/* 46 */       this.b.add(new im(this, str, d, localArrayList));
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 52 */     paramet.writeInt(this.a);
/* 53 */     paramet.writeInt(this.b.size());
/*    */     
/* 55 */     for (im localim : this.b) {
/* 56 */       paramet.a(localim.a());
/* 57 */       paramet.writeDouble(localim.b());
/* 58 */       paramet.writeShort(localim.c().size());
/*    */       
/* 60 */       for (tj localtj : localim.c()) {
/* 61 */         paramet.writeLong(localtj.a().getMostSignificantBits());
/* 62 */         paramet.writeLong(localtj.a().getLeastSignificantBits());
/* 63 */         paramet.writeDouble(localtj.d());
/* 64 */         paramet.writeByte(localtj.c());
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 71 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 75 */     return this.a;
/*    */   }
/*    */   
/*    */   public List d() {
/* 79 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */