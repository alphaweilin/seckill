package org.seckill.entity;

public class SuccessKilledKey {
    private Long seckillId;

    private Long userPhone;

	public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

	@Override
	public String toString() {
		return "SuccessKilledKey [seckillId=" + seckillId + ", userPhone=" + userPhone + "]";
	}
}